package com.cristianrita;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
        BinaryOperator<Integer> adder = (acc, x) -> acc + x;
        System.out.println(myList.stream().reduce(0, adder));
    }
}
