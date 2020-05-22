package com.ticklersoft.hello_world.conversation;

public class Answer {
    private String text;
    private Question followupQuestion;

    public Answer(String text, Question followupQuestion) {
        this.text = text;
        this.followupQuestion = followupQuestion;
    }

    public String getText() {
        return text;
    }

    public Question getFollowupQuestion() {
        return followupQuestion;
    }

    public boolean isValidAnswer(String userEnteredText) {
        return text.equalsIgnoreCase(userEnteredText);
    }
}
