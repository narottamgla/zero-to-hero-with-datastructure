package org.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Convert12Hour24Hour {

    public static void main(String[] args) {
        String time12Hour = "02:30:55 PM";
        String time24Hour = convertTo24HourFormat(time12Hour);
        System.out.println("12-hour format: " + time12Hour);
        System.out.println("24-hour format: " + time24Hour);
    }

    private static String convertTo24HourFormat(String time12Hour) {
            SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss a");
            Date time =null;
            try{
                time = sd.parse(time12Hour);
                System.out.println();
            }catch(Exception e){
                System.out.println("Invalid time format: " + time12Hour);
                return null; // Return null or handle the error as needed
            }
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            return format.format(time);
    }
}
