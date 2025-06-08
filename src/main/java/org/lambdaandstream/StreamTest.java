package org.lambdaandstream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        testList.stream().filter(i->i>1).collect(Collectors.toList()).forEach(j->{
            System.out.println(j);
        });
    }
}
