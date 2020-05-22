package com.ticklersoft.hello_world.conversation;

import java.util.List;
import java.util.Scanner;

public class User {
    private Scanner sc = new Scanner(System.in);

    public Answer ask(Question question){
        System.out.println(question.getText());
        List<Answer> answers = question.getAnswers();
        for (Answer answer : answers) {
            System.out.println(" - " + answer.getText());
        }
        String userEnteredText = getReplyFromUser();
        for (Answer answer : answers) {
            if (answer.isValidAnswer(userEnteredText)) {
                return answer;
            }
        }
        System.out.println("promiň zkus to říct nějak jinak");
        return new Answer("unrecognized", question);
    }

    private String getReplyFromUser() {
        return sc.nextLine();
    }
}
