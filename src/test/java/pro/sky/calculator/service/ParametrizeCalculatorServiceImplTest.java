package pro.sky.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParametrizeCalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForPlusMethodTests() {
        return Stream.of(
                Arguments.of(5, 3, 8),
                Arguments.of(5, 6, 11),
                Arguments.of(0, 3, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusMethodTests")
    public void testPlus(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calculatorService.plus(num1, num2));
    }


    public static Stream<Arguments> provideParamsForMinusMethodTests() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(5, 6, -1),
                Arguments.of(0, 3, -3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusMethodTests")
    public void testMinus(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calculatorService.minus(num1, num2));
    }


    public static Stream<Arguments> provideParamsForMultiplyMethodTests() {
        return Stream.of(
                Arguments.of(5, 3, 15),
                Arguments.of(5, -6, -30),
                Arguments.of(0, 3, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyMethodTests")
    public void testMultiply(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calculatorService.multiply(num1, num2));
    }


    public static Stream<Arguments> provideParamsForDivideMethodTests() {
        return Stream.of(
                Arguments.of(15, 3, 5.0),
                Arguments.of(15, -5, -3.0),
                Arguments.of(2, 0, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideMethodTests")
    public void testDivide(Integer num1, Integer num2, Double result) {
        if (num2 != 0) {
            assertEquals(result, calculatorService.divide(num1, num2));
        } else {
            assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num1, 0));
        }
    }

}

