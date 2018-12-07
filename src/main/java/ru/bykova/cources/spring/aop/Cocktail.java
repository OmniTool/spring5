package ru.bykova.cources.spring.aop;

import org.springframework.stereotype.Component;

@FunctionalInterface
@Component
public interface Cocktail {
    String getName();
}
