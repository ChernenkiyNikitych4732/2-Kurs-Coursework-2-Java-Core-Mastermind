package sky.pro.course2.coursework.service;

import sky.pro.course2.coursework.model.Question;

import java.util.Collection;
public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
