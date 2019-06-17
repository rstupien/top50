package com.rstupien.fibonacci;

import java.util.HashMap;
import java.util.Map;

public final class FibonacciIterable implements Generate {

    private static final Map<Integer, Integer> CACHE = new HashMap<>();

    @Override
    public int generate(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        int tmpFirstValue = 1;
        int tmpSecondValue = 1;
        int result = 1;

        for (int i = 3; i <= number; i++) {
            result = tmpFirstValue + tmpSecondValue;
            tmpFirstValue = tmpSecondValue;
            tmpSecondValue = result;
        }
        return result;
    }

    @Override
    public int optymizedGenerate(int number) {
        return CACHE.computeIfAbsent(number, this::generate);
    }
}
