package org.hackerrank;

import java.util.Arrays;
import java.util.List;

public class SimpleTexEditor {

    public static void main(String[] args) {

        String S = "abcde";

        List<String> operations = List.of(
            "1 xyz", // Append "xyz" at index 3
            "2 2",     // Delete 2 characters from index 2
            "3 1",     // Print character at index 1
            "4 0"      // Undo last operation
        );

        String result = performOperations(S, operations);

    }

    private static String performOperations(String s, List<String> operations) {

        StringBuilder text = new StringBuilder(s);
        String lastOperation = null;
        int lastIndex = -1;

        for (String operation : operations) {
            String[] parts = operation.split(" ");
            int opType = Integer.parseInt(parts[0]);
            String opeartionDetails = parts.length > 1 ? parts[1] : null;

            if (opType==1){
                // Append operation
                String toAppend = parts[1];
                text = new StringBuilder(text.toString() + toAppend);
                lastOperation = "append";
            } else if (opType==2) {
                // Delete operation
                int index = Integer.parseInt(parts[1]);
               text= new StringBuilder(text.substring(0, text.length()-2));

            }
        }

        // Print operation
        System.out.println(text);

        return text.toString();
    }
}
