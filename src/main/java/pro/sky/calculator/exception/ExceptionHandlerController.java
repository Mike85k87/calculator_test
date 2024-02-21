package pro.sky.calculator.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler({IllegalArgumentException.class, NullPointerException.class})
    public String handleControllerNumsException(RuntimeException e){
        return e.getMessage();
    }
}
