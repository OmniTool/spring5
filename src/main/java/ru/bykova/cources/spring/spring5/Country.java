package ru.bykova.cources.spring.spring5;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
class Country {

    Integer id;
    String name;
    String groupName;

//    @Autowired
    public Country(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }
}