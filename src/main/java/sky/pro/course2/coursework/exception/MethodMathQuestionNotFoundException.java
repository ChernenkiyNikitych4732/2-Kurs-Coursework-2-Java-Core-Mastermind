package sky.pro.course2.coursework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
public class MethodMathQuestionNotFoundException extends RuntimeException{
    public MethodMathQuestionNotFoundException() {
    }

}