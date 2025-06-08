package org.solidprinciples.openclose;

public class Car {

    private final String name;
    private final SpeedRate speedRate;

    public Car(String name, SpeedRate speedRate) {
        this.name = name;
        this.speedRate = speedRate;
    }

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speedRate.getSpeed();
    }
}
