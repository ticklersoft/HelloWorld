package com.ticklersoft.hello_world;

import com.ticklersoft.hello_world.conversation.Answer;
import com.ticklersoft.hello_world.conversation.Conversation;
import com.ticklersoft.hello_world.conversation.Question;
import com.ticklersoft.hello_world.conversation.User;

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

}