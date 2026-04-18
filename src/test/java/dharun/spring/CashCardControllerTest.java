package dharun.spring;

import dharun.spring.models.CashCard;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;

@SpringBootTest
class CashCardControllerTest{
    @Test
    void jsonChecker(){
        CashCard card = new CashCard(1000L, 880.1);
    }
}