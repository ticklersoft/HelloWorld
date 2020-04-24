package com.ticklersoft.hello_world;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //aplikace na hádání čísel od 1 do 10
        System.out.println("Hádej číslo od 1 do 10");
        int cisloKUhadnuti = (int) (Math.random()*10);

        //po spuštění vyzve uživatele k zadání prvního čísla
        Scanner sc = new Scanner(System.in);
        while(true){
            int tipovaneCislo = sc.nextInt();
            // po zadání odpoví [samá voda, přihořívá, hoří]
//            System.out.println(cisloKUhadnuti);
            if(tipovaneCislo == cisloKUhadnuti)   {
                break;
            }
            int tolerancePrihorivani = 2;
            if(Math.abs(tipovaneCislo - cisloKUhadnuti) <= tolerancePrihorivani)   {
                System.out.println("Prihoriva");
            } else {
                System.out.println("Sama voda");
            }
        }
        System.out.println("Hoří");

        // a vyzve hráče k zadání dalšího čísla a celý proces se opakuje, dokud hráč číslo neuhodne

        // na konci vypíše počet pokusů uživatele



    }
}

