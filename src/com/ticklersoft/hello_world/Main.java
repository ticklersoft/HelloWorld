package com.ticklersoft.hello_world;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hádej číslo od 1 do 10");
        int cisloKUhadnuti = generujNahodneCislo();

        int tipovaneCislo;
        boolean uhadnul;
        do {
            tipovaneCislo = uzivateliHadej();
            uhadnul = tipovaneCislo == cisloKUhadnuti;
            if (!uhadnul) {
                vysvetliUzivateliJakMocToNeuhadnul(cisloKUhadnuti, tipovaneCislo);
            }
        } while (!uhadnul);

        System.out.println("Hoří");
    }

    private static int generujNahodneCislo() {
        return (int) (Math.random() * 10);
    }

    private static int uzivateliHadej() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void vysvetliUzivateliJakMocToNeuhadnul(int cisloKUhadnuti, int tipovaneCislo) {
        int tolerancePrihorivani = 2;
        int aktualniTolerance = Math.abs(tipovaneCislo - cisloKUhadnuti);
        if (aktualniTolerance <= tolerancePrihorivani) {
            System.out.println("Prihoriva");
        } else {
            System.out.println("Sama voda");
        }
    }

}

