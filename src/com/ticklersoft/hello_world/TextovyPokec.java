package com.ticklersoft.hello_world;

import java.util.Scanner;

public class TextovyPokec {
    public static void main(String[] args) {
        //TODO dodelat do cyklu
        String zadanyText = "ahoj";
//        String zadanyText = zadejTextUzivatele();

        //TODO dodelat nejaka sledovana slova a reakce na ne
        if (zadanyText.contains("blaba")){
            System.out.println("odpoved");
        }
        //if (zadanyText.contains("blaba") ...
        //if (zadanyText.contains("blaba") ...
    }

    private static String zadejTextUzivatele() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

}
