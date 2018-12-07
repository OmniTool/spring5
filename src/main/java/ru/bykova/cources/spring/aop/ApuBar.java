package ru.bykova.cources.spring.aop;

import com.sun.istack.internal.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import ru.bykova.cources.spring.spring5.Person;

@Component
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApuBar implements Bar{

    @Override
    @NotNull
    @Congrats
    @FeedbackNeeded
    public Cocktail sellCoctail(@NotNull Person person) {
        if (person.isBroke())
        {
            System.out.println("==========POOR BABY!");
            throw new CustomBrokenException();
        }
        System.out.println("==========SOLD!");
        return () -> "Usual Cocktail";
    }
}
