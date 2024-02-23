package Seminar5.number;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class RandomNumberModuleTest {
    @Test
    void numbers() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();

        ArrayList<Integer> arrayList = randomNumberModule.numbers(10);

        assertThat(arrayList).hasSize(10);
    }
}
