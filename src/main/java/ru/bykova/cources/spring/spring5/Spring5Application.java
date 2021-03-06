package ru.bykova.cources.spring.spring5;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import ru.bykova.cources.spring.aop.ApuBar;
import ru.bykova.cources.spring.aop.Bar;

import java.util.List;

@SpringBootApplication
@ImportResource("application-context.xml")
public class Spring5Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring5Application.class, args);
    }

    @Bean
    Country belarus() {
        return new Country("Беларуссия", "BE");
    }

    @Bean
    Person vasya(Country russia) {
        return Customer.builder()
                .age(15)
                .name("Уася")
                .contact("222-33-222")
                .contact("222-33-222")
                .height(1.48)
                .country(russia)
                .build();
    }

    @Bean
    Bar bar() {
        return ApuBar.builder().build();
    }

    @Bean
    Person customer() {
        return Customer.builder()
                .isBroke(false)
                .age(15)
                .name("Уася")
                .build();
    }

}




