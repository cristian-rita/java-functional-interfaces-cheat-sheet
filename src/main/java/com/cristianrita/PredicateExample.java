package com.cristianrita;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(numbers.filter(isEven).count());
    }
}
