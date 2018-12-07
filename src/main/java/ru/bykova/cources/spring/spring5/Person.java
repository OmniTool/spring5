package ru.bykova.cources.spring.spring5;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

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
