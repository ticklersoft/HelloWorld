package com.ticklersoft.hello_world;

import com.ticklersoft.hello_world.conversation.Answer;
import com.ticklersoft.hello_world.conversation.Conversation;
import com.ticklersoft.hello_world.conversation.Question;
import com.ticklersoft.hello_world.conversation.User;

import javax.swing.*;

public class TextovyPokecObjektove {
    public static void main(String[] args) {
        User user = new User();

        Question q1_initialQuestion = new Question("Zkus na začátek hezky pozdravit... :-)");
        Question q2_jakSeMas = new Question("Jak se máš?");
        Question q3_thatWasNotNiceHowAreYou = new Question("To nebylo moc hezké.. :-( Jak se máš?");
        Question q4_howWasYourDay = new Question("Jaký byl tvůj den?" );
        Question q5_doYouLike1 = new Question("Máš rád pizzu_");
        Question q6_doYouLike2 = new Question("A co třeba palačinky?");
        Question q7_canYouCook = new Question("Umíš vařit?");

        q1_initialQuestion.addAnswer(new Answer("ahoj", q2_jakSeMas));
        q1_initialQuestion.addAnswer(new Answer("trhni si", q3_thatWasNotNiceHowAreYou));
        q4_howWasYourDay.addAnswer(new Answer ( "Dobrý"));
        q4_howWasYourDay.addAnswer(new Answer ( "Špatný"));
        q5_doYouLike1.addAnswer(new Answer ("Ano"));
        q5_doYouLike1.addAnswer(new Answer ("Ne"));
        q6_doYouLike2.addAnswer(new Answer ("Ano"));
        q6_doYouLike2.addAnswer(new Answer ("Ne"));
        q7_canYouCook.addAnswer(new Answer ("Ano"));
        q7_canYouCook.addAnswer(new Answer ("Ne"));

        Conversation conversation = new Conversation(q1_initialQuestion);
        conversation.startConversation(user);
        Conversation conversation = new Conversation(q2_jakSeMas);
        conversation.startConversation(user);
        Conversation conversation = new Conversation(q3_thatWasNotNiceHowAreYou);
        conversation.startConversation(user);
        Conversation conversation = new Conversation(q4_howWasYourDay);
        conversation.startConversation(user);
        Conversation conversation = new Conversation(q5_doYouLike1);
        conversation.startConversation(user);
        Conversation conversation = new Conversation(q6_doYouLike2);
        conversation.startConversation(user);
        Conversation conversation = new Conversation(q7_canYouCook);
        conversation.startConversation(user);
    }

}