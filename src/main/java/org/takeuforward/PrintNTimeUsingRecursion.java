package org.takeuforward;

public class PrintNTimeUsingRecursion {

    public static void main(String[] args) {
        String message = "Singh";
        int n=10;
        printMessage(n);
    }


    public static void printMessage(int n) {
        if (n==0){
            return;
        }

        printMessage(n-1);
        System.out.println(n);
    }
}
