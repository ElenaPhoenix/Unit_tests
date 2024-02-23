package Seminar5.number;

import java.util.ArrayList;

/**
 * Создайте два модуля. Первый модуль генерирует список случайных чисел. Второй модуль находит максимальное число в этом
 *  списке. Вам нужно сначала написать юнит-тесты для каждого модуля, затем написать интеграционный тест, который
 *  проверяет, что оба модуля работают вместе правильно.
 */
public class MaxNumberModule {

    public Integer maxValue(ArrayList<Integer> list) {
        Integer max=list.get(0);
        for (Integer element : list) {
            if(element > max){
                max= element;
            }
        }
        return max;
    }
}
