package com.ticklersoft.hello_world.conversation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConversationFileLoader {
    public Conversation loadConversation(String fileName){
        System.out.println("Nacitam soubor " + fileName);
        List<String> lines = loadFromFile(fileName);
        if (lines == null) {
            System.out.println("Nepodarilo se nacist soubor " + fileName);
            return null;
        }

        List<Question> questions = new ArrayList<>(lines.size());
        collectQuestions(lines, questions);

        if (!collectAnswers(lines, questions)) {
            System.out.println("V souboru se vyskytuji chyby");
            return null;
        }

        System.out.println("Nahrano " + questions.size() + " otazek.");

        Conversation conversation = new Conversation(questions.get(0));
        return conversation;
    }

    private boolean collectAnswers(List<String> lines, List<Question> questions) {
        Question aktualniOtazka = null;
        for (String line : lines) {
            if (line.trim().isEmpty()) {
                continue;
            }
            if (line.startsWith("Q")){
                int prvniMezera = line.indexOf(' ');
                String idOtazky = line.substring(0, prvniMezera);
                aktualniOtazka = findQuestionById(questions, idOtazky);
            } else if (line.startsWith("-")) {
                String[] castiOdepovedi = line.split(";");
                String textOdpovedi = castiOdepovedi[0].substring(1);
                String idNavazujiciOtazky = castiOdepovedi[1];
                if (aktualniOtazka == null){
                    System.out.println("Nepodarilo se najit otazku k odpovedi: " + line);
                    return false;
                }
                Question navazujiciOtazka = findQuestionById(questions, idNavazujiciOtazky);
                if (navazujiciOtazka == null){
                    System.out.println("Nepodarilo se najit navazujici otazku k odpovedi: " + line);
                    return false;
                }
                aktualniOtazka.addAnswer(new Answer(textOdpovedi, navazujiciOtazka));
            } else {
                System.out.println("Nepodařilo se poznat typ řádky u textu: " + line);
                return false;
            }
        }
        return true;
    }

    private void collectQuestions(List<String> lines, List<Question> questions) {
        for (String line : lines) {
            if (line.startsWith("Q")){
                int prvniMezera = line.indexOf(' ');
                String idOtazky = line.substring(0, prvniMezera);
                String textOtazky = line.substring(prvniMezera + 1);
                questions.add(new Question(idOtazky, textOtazky));
            }
        }
    }

    private List<String> loadFromFile(String fileName) {
        List<String> lines;
        try {
            lines = Files.readAllLines(Path.of(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return lines;
    }

    private static Question findQuestionById(List<Question> questions, String idNavazujiciOtazky) {
        for (Question question : questions) {
            if (question.getId().equals(idNavazujiciOtazky)){
                return question;
            }
        }
        return null;
    }
}
