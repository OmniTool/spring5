package ru.bykova.cources.spring.spring5;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Spring5Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring5Application.class, args);
    }

    @Bean
    Country russia() {
        return new Country("Россия", "RU");
    }

    @Bean
    Person person(Country russia) {
        return Person.builder()
                .age(15)
                .name("Уася")
                .contact("222-33-222")
                .contact("222-33-222")
                .height(1.48)
                .country(russia)
                .build();
    }
}

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
class Country {

    Integer id;
    String name;
    String groupName;

    public Country(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }
}

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
class Person {

    Long id;
    String name;
    Country country;
    int age;
    double height;
    boolean isProgrammer;
    @Singular
    List<String> contacts;
}
