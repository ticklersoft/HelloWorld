package com.ticklersoft.hello_world;

import java.util.Scanner;

public class TextovyPokec {
    public static void main(String[] args) {
        String zadanyText = "ahoj";
//        String zadanyText = zadejTextUzivatele();

        if (zadanyText.contains("blaba")){
            System.out.println("odpoved");
        }
    }

    private static String zadejTextUzivatele() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

}
