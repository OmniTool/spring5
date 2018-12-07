package ru.bykova.cources.spring.singleton;

// Пример double check locker
// проблемы возникают при работе нескольких класс-лоадеров => spring
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public Singleton getInstance() {
        if (instance == null)
        {
            synchronized (Singleton.class) {
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}