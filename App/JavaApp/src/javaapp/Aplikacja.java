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

public class Aplikacja {
    Scanner input = new Scanner(System.in);

    private Pracownik aktualny_pracownik;
    private ArrayList<Pracownik> pracownicy;
    private ArrayList<Klient> klienci;
    private ArrayList<Wypozyczenie> wypozyczenia;
    private ArrayList<Pojazd> pojazdy;
    private ArrayList<Rezerwacja> rezerwacje;

    public Aplikacja() {
        this.wypozyczenia = new ArrayList<>();
    }
    
    public void dodanieKlienta(){
        
    }

    public void logowanie(){
        System.out.print("identyfikator pracownika(PESEL): ");
        String wybrane_id = input.nextLine();


//        wybrane_id = "33333333333";


        for (Pracownik item: pracownicy){
            if (item.getPesel().equals(wybrane_id)){
                this.setAktualny_pracownik(item);
                System.out.println("ZALOGOWANO");
                return;
            }
        }
        System.out.println("Nie znaleziono pracownika");
    }

    public void stworzenieNowegoWypozyczenia(){
        int before = this.getWypozyczenia().size();
        this.aktualny_pracownik.stworzenieNowegoWypozyczenia(this.getKlienci(), this.getPojazdy(), this.getWypozyczenia());
        int after =  this.getWypozyczenia().size();

        if (before == after){
            return;
        }
        Wypozyczenie wypozyczenie = this.getWypozyczenia().get(this.getWypozyczenia().size()-1);

        wypozyczenie.wyliczeniePrognozowanejCeny();

        System.out.printf("Prognozowana Cena: %.2f\n", wypozyczenie.getCenaPrognozowana());
        System.out.print("Potwierdzic wypozyczenie(y/n)?: ");
        String wybor = input.nextLine();

        if (wybor.equals("y")){
            wypozyczenie.rozpoczecieOkresuWypozyczenia();
        }
        else {
            this.getWypozyczenia().remove(this.getWypozyczenia().size()-1);
        }

    }
    
    public void zamkniecieWypozyczenia(){
        
    }
    
    public void rezerwacjaPojazdu(){
        
    }
    
    public void odwolanieRezerwacji(){
        
    }
    
    public void ocenieniePojazdu(){
        
    }
    
    public void dodaniePojazdu(){
        
    }
    
    public void usunieciePojazdu(){
        
    }

    public Pracownik getAktualny_pracownik() {
        return aktualny_pracownik;
    }

    public void setAktualny_pracownik(Pracownik aktualny_pracownik) {
        this.aktualny_pracownik = aktualny_pracownik;
    }

    public ArrayList<Pracownik> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(ArrayList<Pracownik> pracownicy) {
        this.pracownicy = pracownicy;
    }

    public ArrayList<Klient> getKlienci() {
        return klienci;
    }

    public void setKlienci(ArrayList<Klient> klienci) {
        this.klienci = klienci;
    }

    public ArrayList<Wypozyczenie> getWypozyczenia() {
        return wypozyczenia;
    }

    public void setWypozyczenia(ArrayList<Wypozyczenie> wypozyczenia) {
        this.wypozyczenia = wypozyczenia;
    }

    public ArrayList<Pojazd> getPojazdy() {
        return pojazdy;
    }

    public void setPojazdy(ArrayList<Pojazd> pojazdy) {
        this.pojazdy = pojazdy;
    }

    public ArrayList<Rezerwacja> getRezerwacje() {
        return rezerwacje;
    }

    public void setRezerwacje(ArrayList<Rezerwacja> rezerwacje) {
        this.rezerwacje = rezerwacje;
    }
    
    
    


    
}
