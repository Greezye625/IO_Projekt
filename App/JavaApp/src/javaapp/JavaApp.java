/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author greezye
 */

public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //------------------WIELKA INICJALIZACJA------------------
        Scanner input = new Scanner(System.in);

        Aplikacja aplikacja = new Aplikacja();

        Klient klient0 = new Klient("Jan", "Kowalski", "00000000000","000000000", "M");
        Klient klient1 = new Klient("Pawel", "Nowak", "11111111111","111111111", "M");
        Klient klient2 = new Klient("Michal", "Rodzyn", "22222222222","222222222", "M");
        ArrayList<Klient> klienci = new ArrayList<>();
        klienci.add(klient0);
        klienci.add(klient1);
        klienci.add(klient2);

        Pracownik pracownik3 = new Pracownik("Marcin", "Kucharz", "33333333333","333333333");
        Pracownik pracownik4 = new Pracownik("Dawid", "Nos", "44444444444","444444444");
        Pracownik pracownik5 = new Pracownik("Jakub", "Cichy", "55555555555","555555555");
        ArrayList<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(pracownik3);
        pracownicy.add(pracownik4);
        pracownicy.add(pracownik5);


        Pojazd pojazd0 = new Pojazd("0", "Nissan","Juke", 2017,50000, 1.6f, 46, false, 0.0f, 50.0f);
        Pojazd pojazd1 = new Pojazd("1", "Audi","B5", 1997,200000, 1.9f, 60, false, 0.0f, 20.0f);
        Pojazd pojazd2 = new Pojazd("2", "Renault","Megane", 1995,215000, 1.5f, 50, false, 0.0f, 17.0f);
        ArrayList<Pojazd> pojazdy = new ArrayList<>();
        pojazdy.add(pojazd0);
        pojazdy.add(pojazd1);
        pojazdy.add(pojazd2);


        aplikacja.setKlienci(klienci);
        aplikacja.setPracownicy(pracownicy);
        aplikacja.setPojazdy(pojazdy);


        //---------------------------MENU----------------------------------
        String choice;
        do{
            System.out.print("\n1.Logowanie\n2.Stworz Wypozyczenie\n3.Zakoncz wypozyczenie\n0.Exit\n");
            choice = input.nextLine();
            switch (choice) {
                case "1": {
                    aplikacja.logowanie();
                    break;
                }
                case "2": {
                    if(aplikacja.getAktualny_pracownik() != null){
                        aplikacja.stworzenieNowegoWypozyczenia();
                    }
                    else{
                        System.out.println("Najpierw zaloguj sie");
                    }
                    break;
                }
                case "3": {
                    if(aplikacja.getAktualny_pracownik() != null){
                        aplikacja.zamkniecieWypozyczenia();
                    }
                    else{
                        System.out.println("Najpierw zaloguj sie");
                    }
                    break;
                }
                case "0": {
                    break;
                }
                default:
                    break;
            }

        }while(!choice.equals("0"));

    }
    
}
