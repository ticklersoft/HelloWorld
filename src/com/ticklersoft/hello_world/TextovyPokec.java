package com.ticklersoft.hello_world;

import java.util.Scanner;

public class TextovyPokec {
    public static void main(String[] args) {
        System.out.println("Vitej v kecacim programu!");
        System.out.println("Zkus na začátek hezky pozdravit... :-)");

        //TODO dodelat do cyklu

        String zadanyText = zadejTextUzivatele();

        if (zadanyText.contains("ahoj")) {
            System.out.println("ahoj");
        } else {
            System.out.println("promiň zkus to říct nějak jinak");
        }

        if (zadanyText.contains("jak se máš?")) {
            System.out.println("dobře a ty?");
        } else {
            System.out.println("promiň zkus to říct nějak jinak");
        }

        if (zadanyText.contains("spatně")) {
            System.out.println("co se stalo?");
        } else {
            System.out.println("promiň zkus to říct nějak jinak");
        }
    }

    private static String zadejTextUzivatele() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

}