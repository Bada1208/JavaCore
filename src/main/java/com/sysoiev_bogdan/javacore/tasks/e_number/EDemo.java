package com.sysoiev_bogdan.javacore.tasks.e_number;

import java.math.BigDecimal;

/**
 * Найдите число e до указаной цифры после запятой — как и в предыдущем примере,
 * нужно сделать так, чтобы программа сгенерировала значение e с точностью знаков
 * после запятой, равной введённому числу.
 */
public class EDemo {
    private final static BigDecimal E = new BigDecimal("2.7182818284590452353602874713527");

    static BigDecimal eToValueWithLessLength(int index) {
        String newValue = "";
        char[] array = E.toPlainString().toCharArray();
        for (int i = 0; i < array.length; i++) {
            newValue += array[i];
            if (i == index + 1) break;
        }
        return new BigDecimal(newValue);
    }

    public static void main(String[] args) {
        System.out.println(E);
        System.out.println(eToValueWithLessLength(13));
    }
}
