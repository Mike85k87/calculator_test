package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Integer plus(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            throw new NullPointerException("Необходимо ввести значения num1 и num2");
        } else if (num1 == null) {
            throw new NullPointerException("Необходимо ввести значение num1");
        } else if (num2 == null) {
            throw new NullPointerException("Необходимо ввести значение num2");
        } else {
            return num1 + num2;
        }
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            throw new NullPointerException("Необходимо ввести значения num1 и num2");
        } else if (num1 == null) {
            throw new NullPointerException("Необходимо ввести значение num1");
        } else if (num2 == null) {
            throw new NullPointerException("Необходимо ввести значение num2");
        } else {
            return num1 - num2;
        }
    }

    @Override
    public Double divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 недопустимо");
        }
        if (num1 == null && num2 == null) {
            throw new NullPointerException("Необходимо ввести значения num1 и num2");
        } else if (num1 == null) {
            throw new NullPointerException("Необходимо ввести значение num1");
        } else if (num2 == null) {
            throw new NullPointerException("Необходимо ввести значение num2");
        } else {
            return (double) num1 / num2;
        }
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            throw new NullPointerException("Необходимо ввести значения num1 и num2");
        } else if (num1 == null) {
            throw new NullPointerException("Необходимо ввести значение num1");
        } else if (num2 == null) {
            throw new NullPointerException("Необходимо ввести значение num2");
        } else {
            return num1 * num2;
        }
    }
}
