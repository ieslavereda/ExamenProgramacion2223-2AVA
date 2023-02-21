package es.ieslavereda.exercise1;

import java.util.Set;

abstract class Bird extends Pet {

    // ATTRIBUTES
    private boolean fly;

    // CONSTRUCTOR
    public Bird(String name, String owner, int age, Set<Color> colors, boolean fly) {
        super(name, owner, age, colors);
        this.fly = fly;
    }

    // ABSTRACT METHODS
    public abstract void speak();
    public abstract void fly();
    public abstract void repose();

    // GETTERS & SETTERS
    public boolean getFly() {
        return fly;
    }
    public void setFly(boolean fly) {
        this.fly = fly;
    }
}
