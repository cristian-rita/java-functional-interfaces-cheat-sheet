package com.cristianrita;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Kevin");
        Consumer<String> printName = (name) -> System.out.println("This is " + name);
        names.forEach(printName);
    }
}
