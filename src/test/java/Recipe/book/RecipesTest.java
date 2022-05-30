package Recipe.book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.Recipe.book.Repository.RecipeRepo;
import com.Recipe.book.entity.recipes;
import com.Recipe.book.service.RecipeService;

@SpringBootTest

public class RecipesTest extends BookApplicationTests{
	
	@MockBean
	RecipeRepo recipeRepo;
	
	@Autowired
	RecipeService recipeService;
	
	private recipes getRecipe() {
recipes recipe = new recipes();
		
		recipe.setRecipeId(15);
		recipe.setRecipeName("Maggie");
		recipe.setServing(1);
		recipe.setInstructions("1.Boil water 2.Add maggie masala...");
		recipe.setVegetarian(true);
		 return recipe;		
	}

	@Test
	void AddRecipeTest() throws Exception{
		recipes recipe = getRecipe();
		when(recipeRepo.save(recipe)).thenReturn(recipe);
		assertEquals(recipe,recipeService.createrecipe(recipe));
	}
	
	@Test
	void GetRecipeTest() throws Exception{
		recipes recipe = getRecipe();
		String RecipeName = "Maggie";
		when (recipeRepo.findByrecipeName("Maggie")).thenReturn(Optional.of(recipe));
		assertEquals(recipe,recipeService.getrecipe(recipe.getRecipeName()));
	}
	
	@Test
	void DeleteRecipeTest() throws Exception{
		recipes recipe = getRecipe();
		when(recipeRepo.findById(15)).thenReturn(Optional.of(recipe));
		recipeService.deleteRecipe(15);
		verify(recipeRepo,times(1)).deleteById(15);
	}
	
	@Test
	void UpdateRecipeTest() throws Exception {
		recipes recipe = getRecipe();
		recipe.setRecipeName("Masala Maggie");
		recipe.setInstructions("Follow instructions given on packet");
		when(recipeRepo.findById(recipe.getRecipeId())).thenReturn(Optional.of(recipe));
		when(recipeRepo.save(recipe)).thenReturn(recipe);
		assertThat(recipeService.updaterecipe(15, recipe)).isEqualTo(recipe);
	}
}
