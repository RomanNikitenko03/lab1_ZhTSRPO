package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex testComplex = new Complex(0.5, 0.5);
        testComplex.plus(new Complex(1.3, 2.8));
        // Проверяем значения с учетом погрешности для чисел с плавающей точкой
        assertEquals(1.8, testComplex.re, 0.000001);
        assertEquals(3.3, testComplex.im, 0.000001);
    }

    @org.junit.jupiter.api.Test
    void testMinus() {
        Complex testComplex = new Complex(0.3, 0.5);
        testComplex.minus(new Complex(0.1, 0.2));
        // Проверяем значения с учетом погрешности для чисел с плавающей точкой
        assertEquals(0.2, testComplex.re, 0.000001);
        assertEquals(0.3, testComplex.im, 0.000001);
    }
}