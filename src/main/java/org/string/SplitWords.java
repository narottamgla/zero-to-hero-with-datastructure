package org.string;

import java.util.Arrays;

public class SplitWords {
    public static void main(String[] args) {
        String str = "My.name.singh";
        String splitStr[] = str.split("\\.");

        Arrays.stream(splitStr).forEach(strr->{
            System.out.println(strr);
        });
    }
}
