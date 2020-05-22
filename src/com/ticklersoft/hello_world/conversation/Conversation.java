package com.ticklersoft.hello_world.conversation;

public class Conversation {
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
