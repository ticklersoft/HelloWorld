package com.ticklersoft.hello_world;

import java.util.Scanner;

public class PrevratText {
    public static void main(String[] args) {
        //uzivatel zada text
        Scanner sc = new Scanner(System.in);
        String zadanyText = sc.next();

        //program vypise text pozpatku
        String textPozpatku = otocText(zadanyText);
        System.out.println("otoceny text: " + textPozpatku);
    }

    private static String otocText(String zadanyText) {
        return null;
    }
}
