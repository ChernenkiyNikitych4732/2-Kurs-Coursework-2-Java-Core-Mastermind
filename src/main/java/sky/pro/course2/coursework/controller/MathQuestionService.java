package sky.pro.course2.coursework.controller;

import org.springframework.stereotype.Service;
import sky.pro.course2.coursework.exception.MethodMathQuestionNotFoundException;
import sky.pro.course2.coursework.model.Question;
import sky.pro.course2.coursework.service.QuestionService;


import java.util.Collection;
import java.util.Random;

@Service
public class MathQuestionService implements QuestionService {
    @Override
    public Question add(String question, String answer) {
        throw new MethodMathQuestionNotFoundException();
    }

    @Override
    public Question remove(Question question) {
        throw new MethodMathQuestionNotFoundException();
    }

    @Override
    public Collection<Question> getAll() {
        throw new MethodMathQuestionNotFoundException();
    }

    @Override
    public Question getRandomQuestion() {

        Random random = new Random();
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        int operator = random.nextInt(4);
        int answer = 0;
        String operatorSymbol = null;

        switch (operator) {
            case 0:
                operatorSymbol = "+";
                answer = num1 + num2;
                break;
            case 1:
                operatorSymbol = "-";
                answer = num1 - num2;
                break;
            case 2:
                operatorSymbol = "*";
                answer = num1 * num2;
                break;
            case 3:
                operatorSymbol = "/";
                answer = num1 / num2;
                break;
        }

        return new Question("Сколько будет " + num1 + " " + operatorSymbol + " " + num2 + "? ",
                "Ответ : " + answer);
    }
}