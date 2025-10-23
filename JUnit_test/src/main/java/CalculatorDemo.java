public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("=== Простой калькулятор ===");
        System.out.println("5 + 3 = " + calculator.add(5, 3));
        System.out.println("5 - 3 = " + calculator.subtract(5, 3));
        System.out.println("5 * 3 = " + calculator.multiply(5, 3));
        System.out.println("6 / 3 = " + calculator.divide(6, 3));
        System.out.println("2 ^ 4 = " + calculator.power(2, 4));
        System.out.println("√16 = " + calculator.squareRoot(16));

        try {
            System.out.println("5 / 0 = " + calculator.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}