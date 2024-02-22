package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void hello() {
        String helloExcepted = "Добро пожаловать в калькулятор";
        assertEquals(helloExcepted, calculatorService.hello());
    }

    @Test
    public void shouldReturnCorrectResultOfSummation() {
        assertEquals(2, calculatorService.plus(5, -3));
        assertEquals(8, calculatorService.plus(5, 3));
    }

    @Test
    public void shouldThrowNullPointerExceptionWhenNum1IsNull() {
        assertThrows(NullPointerException.class, () -> calculatorService.chekNumber(null, 3));
    }

    @Test
    public void shouldThrowNullPointerExceptionWhenNum2IsNull() {
        assertThrows(NullPointerException.class, () -> calculatorService.chekNumber(5, null));
    }

    @Test
    public void shouldThrowNullPointerExceptionWhenNum1AndNum2IsNull() {
        assertThrows(NullPointerException.class, () -> calculatorService.plus(null, null));
    }

    @Test
    public void shouldReturnCorrectResultOfSubtraction() {
        assertEquals(2, calculatorService.minus(5, 3));
        assertEquals(8, calculatorService.minus(5, -3));
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplication() {
        assertEquals(-15, calculatorService.multiply(5, -3));
        assertEquals(15, calculatorService.multiply(5, 3));
    }

    @Test
    public void shouldReturnCorrectResultOfDivision() {
        assertEquals(-5, calculatorService.divide(15, -3));
        assertEquals(5, calculatorService.divide(15, 3));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNum2IsZero() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(15, 0));
    }
}
