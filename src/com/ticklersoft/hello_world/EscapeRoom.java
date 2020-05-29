package com.ticklersoft.hello_world;

import com.ticklersoft.hello_world.conversation.Answer;
import com.ticklersoft.hello_world.conversation.Conversation;
import com.ticklersoft.hello_world.conversation.Question;
import com.ticklersoft.hello_world.conversation.User;

public class EscapeRoom {
    public static void main(String[] args) {
        User user = new User();
        Room room = new Room();

        Question q1_initialQuestion = new Question("Q1", "Probudil jsi se v temné místnosti.\nVšude je ticho.");

        Question q2_keyFound = new Question("Q2", "Našel jsi studený předmět");
        Question q3_recognizedKey = new Question("Q3", "Vypadá to jako klíč od dveří. Vzal sis ho do kapsy. Co chceš dělat dál.");
        Question q4_foundDoor = new Question("Q4", "Před sebou vidíš světlo v malé dírce.");
        Question q5_atTheDoor = new Question("Q5", "Stojíš u světla - je to klíčová dírka.");
        Question q6_escaped = new Question("Q6", "Unikl jsi ze místnosti, gratuluji!!");

        q1_initialQuestion.addAnswer(new Answer("ohmatat okolí", q2_keyFound));
        q1_initialQuestion.addAnswer(new Answer("vstát", q4_foundDoor));

        q2_keyFound.addAnswer(new Answer("prozkoumat předmět", q3_recognizedKey));
        q3_recognizedKey.addAnswer(new Answer("vstát", q4_foundDoor));

        q4_foundDoor.addAnswer(new Answer("jít ke světlu", q5_atTheDoor));

        q5_atTheDoor.addAnswer(new Answer("odemknout dveře", q6_escaped));

        Conversation conversation = new Conversation(q1_initialQuestion);
        conversation.startConversation(user);
    }

    public static class Room {
        private boolean keyFound;
        private boolean doorUnlocked;

        public boolean isKeyFound() {
            return keyFound;
        }

        public void keyFound() {
            this.keyFound = true;
        }

        public boolean isDoorUnlocked() {
            return doorUnlocked;
        }

        public void doorUnlocked() {
            this.doorUnlocked = true;
        }
    }
}