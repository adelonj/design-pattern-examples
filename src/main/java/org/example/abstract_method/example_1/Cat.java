package org.example.abstract_method.example_1;

public class Cat implements Animal{
    @Override
    public void speak() {
        System.out.println("Cat is meowing");
    }
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
