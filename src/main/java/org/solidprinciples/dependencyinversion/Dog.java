package org.solidprinciples.dependencyinversion;

public class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Woof");
    }

}
