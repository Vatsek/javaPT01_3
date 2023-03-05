package org.example;

public class Main {
    public static void main(String[] args) {

        Person vasya = new Person("Вася");
        Person lesha = new Person("Лёша");
        Cat cat = new Cat("Барсик", "дворовый", vasya.getName());

        cat.callCat(lesha);
        cat.callCat(vasya);
        cat.banishCat(lesha);
        cat.callCat(vasya);
        cat.banishCat(vasya);
        cat.feedCat();
        cat.callCat(vasya);
        cat.feedCat();
        cat.banishCat(vasya);
        cat.callCat(vasya);
        cat.feedCat();












    }
}