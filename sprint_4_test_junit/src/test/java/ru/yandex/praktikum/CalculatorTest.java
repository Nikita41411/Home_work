package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Инициализация Calculator перед тестом");
    }

    @After
    public void tearDown() {
        System.out.println("Очистка после теста\n");
    }

    @Test
    public void shouldSumPositive() {
        System.out.println("Тест: сложение двух положительных чисел");

        int firstNumber = 1;
        int secondNumber = 9;
        int actual = calculator.sum(firstNumber, secondNumber);
        int expected = 10;

        System.out.println(firstNumber + " + " + secondNumber + " = " + actual);
        assertEquals(expected, actual);

        System.out.println("✓ Тест пройден");
    }

    @Test
    public void shouldSumPositiveAndZero() {
        System.out.println("Тест: сложение положительного числа и нуля");

        int firstNumber = 1;
        int secondNumber = 0;
        int actual = calculator.sum(firstNumber, secondNumber);
        int expected = 1;

        System.out.println(firstNumber + " + " + secondNumber + " = " + actual);
        assertEquals(expected, actual);

        System.out.println("✓ Тест пройден");
    }

    @Test
    public void shouldMultPositive() {
        System.out.println("Тест: умножение двух положительных чисел");

        int firstNumber = 3;
        int secondNumber = 5;
        int actual = calculator.mult(firstNumber, secondNumber);
        int expected = 15;

        System.out.println(firstNumber + " * " + secondNumber + " = " + actual);
        assertEquals(expected, actual);

        System.out.println("✓ Тест пройден");
    }

    @Test
    public void shouldMultPositiveAndZero() {
        System.out.println("Тест: умножение положительного числа и нуля");

        int firstNumber = 7;
        int secondNumber = 0;
        int actual = calculator.mult(firstNumber, secondNumber);
        int expected = 0;

        System.out.println(firstNumber + " * " + secondNumber + " = " + actual);
        assertEquals(expected, actual);

        System.out.println("✓ Тест пройден");
    }

    @Test
    public void shouldMultPositiveAndOne() {
        System.out.println("Тест: умножение положительного числа и единицы");

        int firstNumber = 8;
        int secondNumber = 1;
        int actual = calculator.mult(firstNumber, secondNumber);
        int expected = 8;

        System.out.println(firstNumber + " * " + secondNumber + " = " + actual);
        assertEquals(expected, actual);

        System.out.println("✓ Тест пройден");
    }
}