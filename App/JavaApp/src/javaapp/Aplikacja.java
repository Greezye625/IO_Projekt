/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import java.util.ArrayList;

/**
 *
 * @author greezye
 */
public class Aplikacja {
    private ArrayList<Pracownik> pracownicy;
    private ArrayList<Klient> klienci;
    private ArrayList<Wypozyczenie> wypozyczenia;
    private ArrayList<Pojazd> pojazdy;
    private ArrayList<Rezerwacja> rezerwacje;

    public Aplikacja(ArrayList<Pracownik> pracownicy, ArrayList<Klient> klienci, ArrayList<Wypozyczenie> wypozyczenia, ArrayList<Pojazd> pojazdy, ArrayList<Rezerwacja> rezerwacje) {
        this.pracownicy = pracownicy;
        this.klienci = klienci;
        this.wypozyczenia = wypozyczenia;
        this.pojazdy = pojazdy;
        this.rezerwacje = rezerwacje;
    }
    
    public void dodanieKlienta(){
        
    }
    
    public void stworzenieNowegoWypozyczenia(){
        
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
