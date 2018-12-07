package ru.bykova.cources.spring.aop;

import com.sun.istack.internal.NotNull;
import lombok.AccessLevel;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import ru.bykova.cources.spring.spring5.Customer;

//@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
@Aspect
//@Slf4j
public class Politness {

    @Before("@annotation(Congrats)")
    public final void sayHello(@NotNull JoinPoint joinPoint) {
        System.out.println("==========Hello " + ((Customer) joinPoint.getArgs()[0]).getName() + ". How are you doing?");
    }

    @AfterReturning(pointcut = "@annotation(FeedbackNeeded)", returning = "retVal")
    public final void askOpinion(@NotNull Object retVal) {
        System.out.printf("===========IS GOOD ENOUGH? ", ((Cocktail) retVal).getName());
    }

//    @Before("execution(* sellSquishee(..))")
//    public void sayHello(JoinPoint joinPiont) {
//        System.out.println();
//        System.out.println("Hello " + ((Customer) joinPiont.getArgs()[0]).getName() + ". How are you doing? \n");
//    }

//    @AfterReturning(pointcut = "execution(* sellSquishee(..))",
//            returning = "retVal", argNames = "retVal")
//    public void askOpinion(Object retVal) {
//        System.out.println("Is " + ((Cocktail) retVal).getName() + " Good Enough? \n");
//    }

    public void sayYouAreNotAllowed() {
        System.out.println("Hmmm... \n");
    }

    public void sayGoodBye() {
        System.out.println("Good Bye! \n");
    }

    public Object sayPoliteWordsAndSell(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Hi! \n");
        Object retVal = pjp.proceed();
        System.out.println("See you! \n");
        return retVal;
    }
}
