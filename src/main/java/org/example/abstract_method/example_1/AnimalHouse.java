package org.example.abstract_method.example_1;

public abstract class AnimalHouse {
    private final Animal animal;

    protected AnimalHouse() {
        this.animal = getAnimal();
        this.animal.speak();
        this.animal.eat();
    }
    protected abstract Animal getAnimal();
}
