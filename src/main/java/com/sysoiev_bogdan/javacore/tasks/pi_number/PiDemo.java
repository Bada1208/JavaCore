package com.sysoiev_bogdan.javacore.tasks.pi_number;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Найдите число π до указаной цифры после запятой — введите число и сделайте так,
 * чтобы программа сгенерировала π с точностью знаков после запятой, равной введённому числу.
 */
public class PiDemo {
    private static final BigDecimal pi = new BigDecimal("3.141592653589793238462643");

    static BigDecimal getPi() {
        return pi;
    }

    static BigDecimal piToValueWithLessLength(int index) {

        return (index == 0) ? new BigDecimal("3.0") : pi.setScale(index, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        System.out.println(getPi());
        System.out.println(piToValueWithLessLength(1));
    }
}
