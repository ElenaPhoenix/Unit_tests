package Seminar3.Homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    private MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @AfterEach
    void tearDown() {
        mainHW = null;
    }

    @Test
    @DisplayName("Проверка метода для утверждения числа на четность или нечетность")
    void isEvenOddNumber() {
        assertTrue(mainHW.isEvenOddNumber(2));
        assertFalse(mainHW.isEvenOddNumber(5));
    }

    @Test
    @DisplayName("Проверка метода для вхождения числа в интервал (25;100)")
    void isNumberInInterval() {
        assertTrue(mainHW.isNumberInInterval(36));
        assertFalse(mainHW.isNumberInInterval(101));
        assertFalse(mainHW.isNumberInInterval(24));
    }
}