package org.solidprinciples.openclose;

public class HondaCitySpeed extends SpeedRate{
    private int speed;


    @Override
    public int getSpeed() {
        return 120;
    }


    public static void main(String[] args) {

        Car car = new Car("Honda City", new HondaCitySpeed());
        System.out.println("Speed of " + car.getName() + " " + car.getSpeed() + " km/h");
    }
}
