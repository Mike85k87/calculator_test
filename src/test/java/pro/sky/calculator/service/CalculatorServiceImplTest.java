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
    public void plus_shouldTest() {
        assertEquals(2, calculatorService.plus(5, -3));
        assertEquals(8, calculatorService.plus(5, 3));
    }

    @Test
    public void plus_shouldTestWithNullNum1() {
        assertThrows(NullPointerException.class, () -> calculatorService.plus(null, 3));
    }

    @Test
    public void plus_shouldTestWithNullNum2() {
        assertThrows(NullPointerException.class, () -> calculatorService.plus(5, null));
    }

    @Test
    public void plus_shouldTestWithNullBothParams() {
        assertThrows(NullPointerException.class, () -> calculatorService.plus(null, null));
    }

    @Test
    public void minus_shouldTest() {
        assertEquals(2, calculatorService.minus(5, 3));
        assertEquals(8, calculatorService.minus(5, -3));
    }

    @Test
    public void minus_shouldTestWithNullNum1() {
        assertThrows(NullPointerException.class, () -> calculatorService.minus(null, 3));
    }

    @Test
    public void minus_shouldTestWithNullNum2() {
        assertThrows(NullPointerException.class, () -> calculatorService.minus(5, null));
    }

    @Test
    public void minus_shouldTestWithNullBothParams() {
        assertThrows(NullPointerException.class, () -> calculatorService.minus(null, null));
    }

    @Test
    public void multiply_shouldTest() {
        assertEquals(-15, calculatorService.multiply(5, -3));
        assertEquals(15, calculatorService.multiply(5, 3));
    }

    @Test
    public void multiply_shouldTestWithNullNum1() {
        assertThrows(NullPointerException.class, () -> calculatorService.multiply(null, 3));
    }

    @Test
    public void multiply_shouldTestWithNullNum2() {
        assertThrows(NullPointerException.class, () -> calculatorService.multiply(5, null));
    }

    @Test
    public void multiply_shouldTestWithNullBothParams() {
        assertThrows(NullPointerException.class, () -> calculatorService.multiply(null, null));
    }

    @Test
    public void divide_shouldTest() {
        assertEquals(-5, calculatorService.divide(15, -3));
        assertEquals(5, calculatorService.divide(15, 3));
    }

    @Test
    public void divide_shouldZeroTest() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(15, 0));
    }

    @Test
    public void divide_shouldTestWithNullNum1() {
        assertThrows(NullPointerException.class, () -> calculatorService.divide(null, 3));
    }

    @Test
    public void divide_shouldTestWithNullNum2() {
        assertThrows(NullPointerException.class, () -> calculatorService.divide(5, null));
    }

    @Test
    public void divide_shouldTestWithNullBothParams() {
        assertThrows(NullPointerException.class, () -> calculatorService.divide(null, null));
    }
}
