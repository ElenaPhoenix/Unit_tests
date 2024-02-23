package Seminar5.number;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MaxNumberModuleTest {
    @Test
    void maxValue() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,10,5,-2,3));

        Integer max = maxNumberModule.maxValue(arrayList);

        assertThat(max).isEqualTo(10);
    }
}
