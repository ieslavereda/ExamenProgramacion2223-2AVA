package es.ieslavereda.exercise1;

import java.util.Set;

public class Canary extends Bird {

    // ATTRIBUTES
    private boolean singing;

    // CONSTRUCTOR
    public Canary(String name, String owner, int age, Set<Color> colors, boolean fly, boolean singing) {
        super(name, owner, age, colors, fly);
        this.singing = singing;
    }

    @Override
    public void speak() {
        System.out.println("PIO PIO");
    }
    public void greets() {
        System.out.println("Hello, how are you?");
    }
    @Override
    public void fly() {
        this.setFly(true);
    }
    @Override
    public void repose() {this.setFly(false);}
    
    // GETTERS & SETTERS
    public boolean getSinging() {
        return singing;
    }
    public void setSinging(boolean singing) {
        this.singing = singing;
    }
}
