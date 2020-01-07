/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author greezye
 */
public class Pracownik extends Uzytkownik{
    Scanner input = new Scanner(System.in);

    public Pracownik(String imie, String nazwisko, String pesel, String numerTelefonu) {
        super(imie, nazwisko, pesel, numerTelefonu);
    }
    
    public void stworzenieNowegoWypozyczenia(ArrayList<Klient> klienci, ArrayList<Pojazd> pojazdy, ArrayList<Wypozyczenie> wypozyczenia){
        //
        //------------------WYBOR KLIENTA------------------
        //
        System.out.print("\nPodaj PESEL klienta: ");

        String wybrane_id_klienta = input.nextLine();
        Klient klient = null;

        //
//        wybrane_id_klienta = "00000000000";


        for (Klient item: klienci){
            if (item.getPesel().equals(wybrane_id_klienta)){
                klient = item;
                System.out.println("\nZnaleziono klienta");
                break;
            }
        }

        if (klient == null){
            System.out.println("\nNie znaleziono klienta");
            return;
        }

        System.out.format("%s %s \ntelefon: %s\n\n",klient.getImie(), klient.getNazwisko(), klient.getNumerTelefonu());

        //
        //------------------WYBOR POJAZDU------------------
        //
        ArrayList<String> dostepne_id = new ArrayList<>();

        System.out.println("Dostepne Pojazdy:");
        for (Pojazd item: pojazdy){
            if (!item.isWypozyczony()){
                item.printOpis();
                dostepne_id.add(item.getIdentyfikator());
            }
        }

        System.out.print("\nWybierz id pojazdu do wypozyczenia: ");
        String wybrane_id_pojazdu = input.nextLine();


        //
//        wybrane_id_pojazdu = "1";


        //sprawdzenie poprawnosci wybranego id pojazdu
        if(!dostepne_id.contains(wybrane_id_pojazdu)){
            System.out.println("niedozwolona wartosc");
            return;
        }

        Pojazd wybrany_pojazd = null;
        for (Pojazd item: pojazdy){
            if (item.getIdentyfikator().equals(wybrane_id_pojazdu)){
                wybrany_pojazd = item;
                break;
            }
        }


        //
        //------------------WYBOR DATY ZAKONCZENIA WYPOZYCZENIA------------------
        //
        System.out.println("Wpisz date zakonczenia wypozyczenia (yyyy-mm-dd):");
        String wybrana_data_zakonczenia = input.nextLine();


        //
//        wybrana_data_zakonczenia = "2020-01-13";


        LocalDate planowana_data_zakonczenia = LocalDate.parse(wybrana_data_zakonczenia);


        //
        //------------------UTWORZENIE WYPOZYCZENIA--------------------
        //
        int identyfikator;
        if(wypozyczenia.isEmpty()){
            identyfikator = 0;
        }
        else {
            identyfikator = wypozyczenia.size();
        }
        Wypozyczenie nowe_wypozyczenie = new Wypozyczenie(identyfikator, planowana_data_zakonczenia, klient, wybrany_pojazd);

        wypozyczenia.add(nowe_wypozyczenie);

    }
    
    public void zamkniecieWypozyczenia(){
        
    }
    
    public void DodanieKlienta(){
        
    }
    
    public void dodaniePojazdu(){
        
    }
    
    public void usunieciePojazdu(){
        
    }
}
