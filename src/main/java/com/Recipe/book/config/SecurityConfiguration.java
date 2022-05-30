package com.Recipe.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
  private static final String[] PUBLIC_URLS = { "/h2-console/**" }; /**
	* This configure method is used for in memory authentication.
	*/
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { auth.inMemoryAuthentication().withUser("SGIRAME").password("678").roles("admin");
	}
	/**
	* This configure method is used to bypass h2 database and authenticate.
	*/
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.csrf().disable().authorizeRequests().antMatchers(PUBLIC_URLS).permitAll().anyRequest().authenticated()
	.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().httpBasic(); }
	/**
	* This configure method is used to bypass Websecurity for Swagger and H2.
	*/
	@Override
	public void configure(WebSecurity web) throws Exception {
	web.ignoring().antMatchers("/h2-console/**");
	}
	@SuppressWarnings("deprecation")
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
	return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	}


