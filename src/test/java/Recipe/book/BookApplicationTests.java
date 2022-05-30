package Recipe.book;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.Recipe.book.BookApplication;



@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BookApplication.class)
class BookApplicationTests {



@Test
void contextLoads() {
}
}
