package ru.bykova.cources.spring.spring5;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer implements Person {

    Long id;
    String name;
    Country country;
    int age;
    double height;
    boolean isProgrammer;
    @Builder.Default
    boolean isBroke;
    @Singular
    List<String> contacts;
}
