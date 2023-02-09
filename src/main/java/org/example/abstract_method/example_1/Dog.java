package org.example.abstract_method.example_1;

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");

    }
}
