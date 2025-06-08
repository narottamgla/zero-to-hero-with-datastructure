package org.designpattern.builder;

public class Computer {


    int ram;
    int hdd;
    String cpu;

    private Computer (ComputerBuilder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.cpu = builder.cpu;
    }

    public static class ComputerBuilder {
        int ram;
        int hdd;
        String cpu;

        public ComputerBuilder(int ram, int hdd) {
            this.ram = ram;
            this.hdd = hdd;
        }

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder(16, 512)
                .setCpu("Intel i7")
                .build();

        System.out.println("Computer built with RAM: " + computer.ram + ", HDD: " + computer.hdd + ", CPU: " + computer.cpu);
    }

}
