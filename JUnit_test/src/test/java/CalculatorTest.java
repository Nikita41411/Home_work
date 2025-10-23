import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("=== Начало нового теста ===");
    }

    @AfterEach
    void tearDown() {
        System.out.println("=== Окончание теста ===\n");
    }

    @Test
    void testAdd() {
        System.out.println("Тест сложения:");

        double result1 = calculator.add(2.0, 3.0);
        System.out.println("2.0 + 3.0 = " + result1);
        assertEquals(5.0, result1, 0.001);

        double result2 = calculator.add(2.0, -3.0);
        System.out.println("2.0 + (-3.0) = " + result2);
        assertEquals(-1.0, result2, 0.001);

        double result3 = calculator.add(0.0, 0.0);
        System.out.println("0.0 + 0.0 = " + result3);
        assertEquals(0.0, result3, 0.001);

        System.out.println("✓ Все тесты сложения пройдены успешно");
    }

    @Test
    void testSubtract() {
        System.out.println("Тест вычитания:");

        double result1 = calculator.subtract(3.0, 2.0);
        System.out.println("3.0 - 2.0 = " + result1);
        assertEquals(1.0, result1, 0.001);

        double result2 = calculator.subtract(2.0, -3.0);
        System.out.println("2.0 - (-3.0) = " + result2);
        assertEquals(5.0, result2, 0.001);

        double result3 = calculator.subtract(2.0, 2.0);
        System.out.println("2.0 - 2.0 = " + result3);
        assertEquals(0.0, result3, 0.001);

        System.out.println("✓ Все тесты вычитания пройдены успешно");
    }

    @Test
    void testMultiply() {
        System.out.println("Тест умножения:");

        double result1 = calculator.multiply(2.0, 3.0);
        System.out.println("2.0 * 3.0 = " + result1);
        assertEquals(6.0, result1, 0.001);

        double result2 = calculator.multiply(2.0, -3.0);
        System.out.println("2.0 * (-3.0) = " + result2);
        assertEquals(-6.0, result2, 0.001);

        double result3 = calculator.multiply(0.0, 5.0);
        System.out.println("0.0 * 5.0 = " + result3);
        assertEquals(0.0, result3, 0.001);

        System.out.println("✓ Все тесты умножения пройдены успешно");
    }

    @Test
    void testDivide() {
        System.out.println("Тест деления:");

        double result1 = calculator.divide(6.0, 3.0);
        System.out.println("6.0 / 3.0 = " + result1);
        assertEquals(2.0, result1, 0.001);

        double result2 = calculator.divide(6.0, -3.0);
        System.out.println("6.0 / (-3.0) = " + result2);
        assertEquals(-2.0, result2, 0.001);

        double result3 = calculator.divide(1.0, 2.0);
        System.out.println("1.0 / 2.0 = " + result3);
        assertEquals(0.5, result3, 0.001);

        System.out.println("✓ Все тесты деления пройдены успешно");
    }

    @Test
    void testDivideByZero() {
        System.out.println("Тест деления на ноль:");

        System.out.println("Попытка выполнить: 5.0 / 0.0");

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5.0, 0.0);
        });

        System.out.println("Поймано исключение: " + exception.getMessage());
        assertEquals("Деление на ноль не допускается", exception.getMessage());

        System.out.println("✓ Тест деления на ноль пройден успешно");
    }

    @Test
    void testPower() {
        System.out.println("Тест возведения в степень:");

        double result1 = calculator.power(2.0, 3.0);
        System.out.println("2.0 ^ 3.0 = " + result1);
        assertEquals(8.0, result1, 0.001);

        double result2 = calculator.power(5.0, 0.0);
        System.out.println("5.0 ^ 0.0 = " + result2);
        assertEquals(1.0, result2, 0.001);

        double result3 = calculator.power(2.0, -2.0);
        System.out.println("2.0 ^ (-2.0) = " + result3);
        assertEquals(0.25, result3, 0.001);

        System.out.println("✓ Все тесты возведения в степень пройдены успешно");
    }

    @Test
    void testSquareRoot() {
        System.out.println("Тест извлечения квадратного корня:");

        double result1 = calculator.squareRoot(16.0);
        System.out.println("√16.0 = " + result1);
        assertEquals(4.0, result1, 0.001);

        double result2 = calculator.squareRoot(0.0);
        System.out.println("√0.0 = " + result2);
        assertEquals(0.0, result2, 0.001);

        double result3 = calculator.squareRoot(2.0);
        System.out.println("√2.0 = " + result3);
        assertEquals(1.414, result3, 0.001);

        System.out.println("✓ Все тесты извлечения корня пройдены успешно");
    }

    @Test
    void testSquareRootOfNegativeNumber() {
        System.out.println("Тест извлечения корня из отрицательного числа:");

        System.out.println("Попытка выполнить: √(-4.0)");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-4.0);
        });

        System.out.println("Поймано исключение: " + exception.getMessage());
        assertEquals("Невозможно вычислить квадратный корень отрицательного числа", exception.getMessage());

        System.out.println("✓ Тест с отрицательным числом пройден успешно");
    }
}