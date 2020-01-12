/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author greezye
 */
public class Klient extends Uzytkownik{

    private String plec;

    public Klient(String imie, String nazwisko, String pesel, String numerTelefonu, String plecOsoby) {
        super(imie, nazwisko, pesel, numerTelefonu);
        if(plecOsoby == "M")
            plec = "Mezczyzna";
        else if(plecOsoby == "K")
            plec = "Kobieta";
        }
    
    
    public Klient(String[] dane) {
        super(dane[0], dane[1], dane[2], dane[3]);
        if(dane[4] == "M")
            plec = "Mezczyzna";
        else if(dane[4] == "K")
            plec = "Kobieta";
        
    }
    
    public void rezerwacjaPojazdu(){
        
    }
    
    public void odwolanieRezerwacji(){
        
    }
    
     public void wyswietlDaneKlienta(){
        System.out.println("------------------------");
        System.out.printf("Pojazd id. %s \n", this.imie, this.nazwisko);
        System.out.format("pesel %s \n",this.pesel);
        System.out.format("numerTelefonu %s \n",this.numerTelefonu);
        System.out.format("indentyfikacja plciowa %s \n",this.plec);
        
        
}
}