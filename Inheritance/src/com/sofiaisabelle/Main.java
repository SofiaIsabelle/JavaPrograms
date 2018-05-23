package com.sofiaisabelle;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5 );
        Dog dog = new Dog("Yorkie", 3, 20, 2, 4, 1,24, "long and silky");
        dog.eat();
        dog.walk();
        dog.run();



    }
}
