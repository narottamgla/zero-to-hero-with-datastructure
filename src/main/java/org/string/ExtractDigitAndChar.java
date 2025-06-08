package org.string;

public class ExtractDigitAndChar {

    public static void main(String[] args) {

        String str = "Singh 123 Anay";
        printDigitAndCharacters(str);
    }

    private static void printDigitAndCharacters(String str) {

        for (char c : str.toCharArray()){

            if (Character.isDigit(c)){
                System.out.println("Digit : "+ c);
            }

            else if(Character.isLetter(c)){
                System.out.println("Character: "+ c);
            }
        }
    }
}
