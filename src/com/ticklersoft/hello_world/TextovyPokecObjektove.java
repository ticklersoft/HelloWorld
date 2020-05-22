package com.ticklersoft.hello_world;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextovyPokecObjektove {
    public static void main(String[] args) {
        User user = new User();

        Question q1_initialQuestion = new Question("Zkus na začátek hezky pozdravit... :-)");
        Question q2_jakSeMas = new Question("Jak se máš?");
        Question q3_thatWasNotNiceHowAreYou = new Question("To nebylo moc hezké.. :-( Jak se máš?");

        q1_initialQuestion.addAnswer(new Answer("ahoj", q2_jakSeMas));
        q1_initialQuestion.addAnswer(new Answer("trhni si", q3_thatWasNotNiceHowAreYou));

        Conversation conversation = new Conversation(q1_initialQuestion);
        conversation.startConversation(user);
    }

    public static class Question {
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

    public static class Answer {
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

    public static class Conversation {
        private Question initialQuestion;

        public Conversation(Question initialQuestion) {
            this.initialQuestion = initialQuestion;
        }

        public void startConversation(User user){
            Answer answer = user.ask(initialQuestion);
            while(true) {
                answer = user.ask(answer.getFollowupQuestion());
            }
        }
    }

    public static class User {
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


//
//            System.out.println("Vitej v kecacim programu!");
//        System.out.println("Zkus na začátek hezky pozdravit... :-)");
//
//    //TODO dodelat do cyklu
//
//    String zadanyText = zadejTextUzivatele();
//
//        if (zadanyText.contains("ahoj")) {
//        System.out.println("ahoj");
//    } else {
//        System.out.println("promiň zkus to říct nějak jinak");
//    }
//
//        if (zadanyText.contains("jak se máš?")) {
//        System.out.println("dobře a ty?");
//    } else {
//        System.out.println("promiň zkus to říct nějak jinak");
//    }
//
//        if (zadanyText.contains("spatně")) {
//        System.out.println("co se stalo?");
//    } else {
//        System.out.println("promiň zkus to říct nějak jinak");
//    }
}