package org.twopointers;

public class ValidPalendrome {
    public static void main(String[] args) {

        String s = "ana";
        ValidPalendrome vp = new ValidPalendrome();
        boolean result = vp.isValidPalindrome(s);
        System.out.println("Is the string a valid palindrome? " + result);

    }

    public boolean isValidPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s).reverse();

        if (s == null || s.length() == 0) {
            return true;
        }

        if(s.equals(sb.toString())) {
            return true;
        }
        return false;
    }
}
