package org.oop;

public class Overloading {


   // public void print(int a) {
     //   System.out.println("Integer: " + a);
    //}

    public void print(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
    Overloading overloading = new Overloading();
    overloading.print('a');
    overloading.print(88.7);
    }
}
