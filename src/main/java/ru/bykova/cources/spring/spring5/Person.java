package ru.bykova.cources.spring.spring5;

public interface Person {
    Long getId();

    String getName();

    int getAge();

    boolean isBroke();

    void setId(Long id);

    void setName(String name);

    void setAge(int age);

    void setBroke(boolean isBroke);
}
