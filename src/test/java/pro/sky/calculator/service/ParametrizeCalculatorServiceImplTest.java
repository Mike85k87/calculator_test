package pro.sky.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParametrizeCalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForCalculatorTests() {
        return Stream.of(
                Arguments.of(5, 3),
                Arguments.of(5, 6),
                Arguments.of(0, 3),
                Arguments.of(2, 3),
                Arguments.of(1, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculatorTests")
    public void testPlus(Integer num1, Integer num2) {
        assertEquals(num1 + num2, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculatorTests")
    public void testMinus(Integer num1, Integer num2) {
        assertEquals(num1 - num2, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculatorTests")
    public void testMultiply(Integer num1, Integer num2) {
        assertEquals(num1 * num2, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculatorTests")
    public void testDivide(Integer num1, Integer num2) {
        assertEquals((double) num1 / num2, calculatorService.divide(num1, num2));
    }

}

