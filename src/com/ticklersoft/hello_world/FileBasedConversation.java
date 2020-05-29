package com.ticklersoft.hello_world;

import com.ticklersoft.hello_world.conversation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileBasedConversation {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Chyba: zadej cestu ke souboru s konverzaci.");
            return;
        }
        ConversationFileLoader loader = new ConversationFileLoader();
        Conversation conversation = loader.loadConversation(args[0]);
        if (conversation == null){
            return;
        }
        User user = new User();
        conversation.startConversation(user);
    }



}