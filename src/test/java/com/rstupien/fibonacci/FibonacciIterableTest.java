package com.rstupien.fibonacci;

import com.rstupien.TimingExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(TimingExtension.class)
class FibonacciIterableTest {

    @Test
    void generate() {
        Generate number = new FibonacciIterable();
        int generatedNumber = number.generate(40);
        assertThat(generatedNumber).isEqualTo(102334155);
    }

    @Test
    void optimizedGenerate() {
        Generate number = new FibonacciRecursive();
        int generatedNumber = number.optymizedGenerate(40);
        assertThat(generatedNumber).isEqualTo(102334155);
    }
}