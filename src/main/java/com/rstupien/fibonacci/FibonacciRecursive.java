package com.rstupien.fibonacci;

import java.util.HashMap;
import java.util.Map;

public final class FibonacciRecursive implements Generate {

    private static final Map<Integer, Integer> CACHE = new HashMap<>();

    @Override
    public int generate(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return generate(number - 1) + generate(number - 2);
    }

    @Override
    public int optymizedGenerate(int number) {
        return CACHE.computeIfAbsent(number, this::generate);
    }
}
