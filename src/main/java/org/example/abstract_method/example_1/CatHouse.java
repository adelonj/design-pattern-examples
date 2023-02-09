package org.example.abstract_method.example_1;

public class CatHouse extends AnimalHouse {
    @Override
    protected Animal getAnimal() {
        return new Cat();
    }

}
