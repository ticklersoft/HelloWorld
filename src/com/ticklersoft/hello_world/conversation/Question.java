package com.ticklersoft.hello_world.conversation;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String id;
    private String text;
    private List<Answer> answers;

    public Question(String id, String text) {
        this.id = id;
        this.text = text;
        answers = new ArrayList<>();
    }

    public String getId() {
        return id;
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
