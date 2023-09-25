package sky.pro.course2.coursework.handler;

import sky.pro.course2.coursework.exception.MethodMathQuestionNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class MathQuestionServiceHandler {

    @ExceptionHandler(MethodMathQuestionNotFoundException.class)
    public String mathMethodsNotFoundException() {
        return "Method math is not allowed";
    }
}