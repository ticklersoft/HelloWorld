package com.ticklersoft.hello_world.conversation;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String text;
    private List<Answer> answers;

    public Question(String text) {
        this.text = text;
        answers = new ArrayList<>();
    }

    public String getText() {
        return text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void addAnswer(Answer answer){
        answers.add(answer);
    }
}
