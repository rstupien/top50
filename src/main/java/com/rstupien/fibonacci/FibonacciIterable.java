package com.rstupien.fibonacci;

public final class FibonacciIterable implements Generate {

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
}
