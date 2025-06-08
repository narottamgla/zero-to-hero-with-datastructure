package org.hackerrank;

public class Caesar {

    public static void main(String[] args) {
        String s = "middle-Outz";
        int k = 2;

      //  int a = 'a';
      //  int A = 'A';

     //   System.out.println(a);
      //  System.out.println(A);

        String result = caesarCipher(s, k);
        System.out.println("Original String: " + s);
        System.out.println("Ciphered String: " + result);

      //  a= 97;
        //A= 67;

       // b+3

        //98-97+3
        //=4+97

    }

    private static String caesarCipher(String s, int k) {
        String str = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                System.out.println("Base: " + base);
                c = (char) ((c - base + k) % 26 + base);
                str += c;
            }
        }

        return  str;
    }
}
