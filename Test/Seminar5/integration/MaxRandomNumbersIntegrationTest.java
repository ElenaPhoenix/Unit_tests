package Seminar5.integration;

import Seminar5.number.MaxNumberModule;
import Seminar5.number.RandomNumberModule;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MaxRandomNumbersIntegrationTest {
    @Test
    void mytest() {
        MaxNumberModule maxNumberModuleTest = new MaxNumberModule();
        RandomNumberModule randomNumberModuleTest = new RandomNumberModule();

        ArrayList<Integer> numbers = randomNumberModuleTest.numbers(10);
        Integer value = maxNumberModuleTest.maxValue(numbers);

        assertThat(value).isEqualTo(Collections.max(numbers));
    }
}
