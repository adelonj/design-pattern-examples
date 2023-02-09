package org.example.abstract_method.example_1;

public class DogHouse extends AnimalHouse {

    @Override
    protected Animal getAnimal() {
        return new Dog();
    }
}
