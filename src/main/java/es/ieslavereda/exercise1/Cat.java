package es.ieslavereda.exercise1;

import java.util.Set;

class Cat extends Pet {

    // ATTRIBUTES
    private boolean longHair;
    
    // CONSTRUCTOR
    public Cat(String name, String owner, int age, Set<Color> colors, boolean longHair) {
        super(name, owner, age, colors);
        this.longHair = longHair;
    }

    public void speak() {
        System.out.println("MIAU MIAU");
    }

    // GETTER
    public boolean getLongHair() {
        return longHair;
    }
}
