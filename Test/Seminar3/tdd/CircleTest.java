package Seminar3.tdd;

import Seminar3.tdd.Circle;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    void circleLengthTest() {
        Circle circle = new Circle();
        Double expected = 62.83185307179586;

        Double result = circle.calculateLength(10);

        assertThat(result).isEqualTo(expected);
    }
}