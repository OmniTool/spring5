package ru.bykova.cources.spring.spring5;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.bykova.cources.spring.aop.Bar;
import ru.bykova.cources.spring.spring5.Person;

import static lombok.AccessLevel.PRIVATE;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@FieldDefaults(level = PRIVATE, makeFinal = true)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AopAspectJTest {

    private Bar bar;

    private Person customer;

//    @Before
//    public void setUp() throws Exception {
//
//        bar.sellCoctail(customer);
//    }

    @Test
    @SneakyThrows
    @DisplayName("Test AOP")
    void testAOP() {
        String name =  bar.sellCoctail(customer).getName();
        System.out.println();
        System.out.println("============COMPLETED");
//        assertEquals("Exp Res", name);


    }

//    @Test
//    public void testBeforeAdvice() {
//        assertTrue("Before advice is not good enought...", AopLog.getStringValue().contains("Hello"));
//        assertTrue("Before advice is not good enought...", AopLog.getStringValue().contains("How are you doing?"));
//        System.out.println(AopLog.getStringValue());
//    }
//
//    @Test
//    public void testAfterAdvice() {
//        System.out.println(AopLog.getStringValue());
//        assertTrue("After advice is not good enought...", AopLog.getStringValue().contains("Good Bye!"));
//    }
//
//    @Test
//    public void testAfterReturningAdvice() {
//        assertTrue("Customer is broken", AopLog.getStringValue().contains("Good Enough?"));
//        System.out.println(AopLog.getStringValue());
//    }
//
//    @Test
//    public void testAroundAdvice() {
//        assertTrue("Around advice is not good enought...", AopLog.getStringValue().contains("Hi!"));
//        assertTrue("Around advice is not good enought...", AopLog.getStringValue().contains("See you!"));
//        System.out.println(AopLog.getStringValue());
//    }
//
//    @Test
//    public void testAllAdvices() {
//        assertFalse("barObject instanceof ApuBar", bar instanceof ApuBar);
//    }

}
