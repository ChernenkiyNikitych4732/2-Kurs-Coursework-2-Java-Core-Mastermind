package sky.pro.course2.coursework.repository;

import sky.pro.course2.coursework.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(String question, String answer);

    Question remove(Question question);

    Collection<Question> getAll();
}
