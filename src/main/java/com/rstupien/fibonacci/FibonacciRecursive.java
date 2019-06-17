package com.rstupien.fibonacci;

public final class FibonacciRecursive implements Generate {

    @Override
    public int generate(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return generate(number - 1) + generate(number - 2);
    }
}
