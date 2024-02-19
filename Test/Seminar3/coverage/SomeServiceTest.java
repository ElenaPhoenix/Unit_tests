package Seminar3.coverage;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {

    SomeService someService = new SomeService();
    @BeforeEach // выносим повторяющиеся условия перед каждым тестом
    void setUp() { // setUp - общепринятое название
        someService = new SomeService();
    }

   // 3.1.
    @Test
    void multipleThreeNotFiveReturnsFizz() {
        String result = someService.fizzBuzz(6);

        assertEquals("Fizz", result);
    }

    @Test
    void multipleFiveNotThreeReturnsBuzz() {
        String result = someService.fizzBuzz(10);

        assertEquals("Buzz", result);
    }

    @Test
    void multipleFiveteenReturnsFizzBuzz() {
        String result = someService.fizzBuzz(30);

        assertEquals("FizzBuzz", result);
    }

    @Test
    void notMultipleReturnsNumb() {
        String result = someService.fizzBuzz(31);

        assertEquals("31", result);
    }


    // 3.2.
    @Test
    void lastNumberIsSixReturnsTrue() {
        int[] myArray = new int[] {1, 0, 1, 6};

        assertTrue(someService.firstLast6(myArray));
    }

    @Test
    void firstNumberIsSixReturnsTrue() {
        int[] myArray = new int[] {6, 0, 1, 4};

        assertTrue(someService.firstLast6(myArray));
    }

    @Test
    void firstLastNumberIsNotSixReturnsFalse() {
        int[] myArray = new int[] {1, 0, 1, 3};

        assertFalse(someService.firstLast6(myArray));
    }


    // 3.3. Упростить имеющиеся тесты
    @Test
    void insufficientCoverageTest(){

        System.out.println(someService.calculatingDiscount(2000.0, 10));
        assertThat(someService.calculatingDiscount(2000.0, 50))
                .isEqualTo(1000); // обычная скидка
        assertThat(someService.calculatingDiscount(2000.0, 100))
                .isEqualTo(0); // обычная скидка
        assertThat(someService.calculatingDiscount(2000.0, 0))
                .isEqualTo(2000); // обычная скидка


        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%

        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
    }

    // Исправленные тесты:
//    @ParameterizedTest
//    @CsvSource({"2000.0, 50, 1000", "2000.0, 100, 0", "2000.0, 0, 2000"})
//    void mainDiscount(Double price, int discount, int result){
//        assertThat(someService.calculatingDiscount(price, discount))
//                .isEqualTo(result);
//    }
//    @ParameterizedTest
//    @CsvSource({"2000.0, 101", "2000.0, -10"})
//    void insufficientCoverage(Double price, int discount){
//        assertThatThrownBy(() ->
//                someService.calculatingDiscount(price, discount))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
//    }


    // 3.4.
    @Test
    void sumOfNumb() {
        assertEquals(6, someService.luckySum(1, 2, 3));
    }

    @Test
    void sumOfNumbWithoutFirst13() {
        assertEquals(8, someService.luckySum(13, 4, 4));
    }

    @Test
    void sumOfNumbWithoutSecond13() {
        assertEquals(8, someService.luckySum(4, 13, 4));
    }

    @Test
    void sumOfNumbWithoutLast13() {
        assertEquals(8, someService.luckySum(4, 4, 13));
    }
}