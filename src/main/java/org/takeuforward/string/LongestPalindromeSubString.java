package org.takeuforward.string;

public class LongestPalindromeSubString {

    public static void main(String[] args) {

      String s1 = "abb";

      String findPalindrome = getLongestPalindrome(s1);

      System.out.println(findPalindrome);

    }

    private static String getLongestPalindrome(String s1) {
        String palidrome="";
        int count =0;
        for (int i=0;i< s1.length();i++){
            for (int j=i+1;j<= s1.length();j++){
                String s2 = s1.substring(i,j);
                System.out.println(s2);
              if (isPalindrome(s2) && s2.length()>count){
                  palidrome=s2;
                  count= s1.length();

              }
            }
        }

        System.out.println("Palindrome string:"+ palidrome);
        System.out.println("count:"+ count);
        return palidrome;
    }

    private static boolean isPalindrome(String s1){
        if (s1.length()<2){
            return false;
        }
        return String.valueOf(new StringBuilder(s1).reverse()).equals(s1);
    }


}
