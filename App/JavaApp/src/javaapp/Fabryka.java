/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author tomek
 */
public class Fabryka {
    

    public Wypozyczenie stworzWypozyczenie( LocalDate planowana_data_zakonczenia,Klient klient, Pojazd wybrany_pojazd) {
        Wypozyczenie  noweWypozyczenie;
        noweWypozyczenie = new Wypozyczenie(planowana_data_zakonczenia, klient,  wybrany_pojazd);
        return noweWypozyczenie;    
    }   
    public Klient stworzKlienta( String[] daneKlienta) {
        Klient nowyKlient = null;
        if(daneKlienta[4] == "M")
            nowyKlient = new Klient(daneKlienta);
        else if(daneKlienta[4] == "K")
            nowyKlient = new Klient(daneKlienta);
        
    return nowyKlient;
    
    }
  }

