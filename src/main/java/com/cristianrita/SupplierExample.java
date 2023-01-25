package com.cristianrita;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    private static Optional<Integer> findUserIdByEmail(String email) {
        if (Math.random() > 0.5) return Optional.of(1);
        return Optional.empty();
    }

    public static void main(String[] args) {
        Supplier<Integer> idSupplier = () -> new Random().nextInt(100);
        System.out.println(findUserIdByEmail("test@email.com").orElseGet(idSupplier));
    }
}
