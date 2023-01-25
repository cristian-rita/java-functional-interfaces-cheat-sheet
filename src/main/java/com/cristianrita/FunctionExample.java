package com.cristianrita;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by Cristian Rita on 22.01.2023.
 */
public class FunctionExample {

    public static void main(String[] args) {
        Stream<Integer> numberList = Stream.of(10, 20, 30);
        Function<Integer, Integer> multiplier = (x) -> x * 2;
        numberList.map(multiplier).forEach(System.out::println); //map takes a Function
    }
}
