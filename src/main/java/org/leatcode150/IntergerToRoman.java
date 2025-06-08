package org.leatcode150;

import java.util.HashMap;
public class IntergerToRoman {

    static HashMap<Integer, String> hm = new HashMap<Integer,String>();

    public static void main(String[] args) {
        int num = 1;
        hm.put(1, "I");
        hm.put(4, "IV");
        hm.put(5, "V");
        hm.put(9, "IX");
        hm.put(10, "X");
        hm.put(40, "XL");
        hm.put(50, "L");
        hm.put(90, "XC");
        hm.put(100, "C");
        hm.put(400, "CD");
        hm.put(500, "D");
        hm.put(900, "CM");
        hm.put(1000, "M");


        String result = intToRoman(num);
        System.out.println("The Roman numeral for " + num + " is: " + result);
    }

    private static String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();
        int[] keys = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int key : keys) {
            while (num >= key) {
                sb.append(hm.get(key));
                num -= key;
            }
        }
        return sb.toString();
    }
}
