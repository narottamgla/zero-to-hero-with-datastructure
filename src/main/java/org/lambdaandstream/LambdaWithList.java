package org.lambdaandstream;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaWithList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(i->{
            System.out.println(i);
        });
    }
}
