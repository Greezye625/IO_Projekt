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
 * @author greezye
 */
public class Wypozyczenie {

    private static final float CENA = 50.0f;

    private static int idWypozyczenia = 0;
    private int identyfikator;
    private float cenaPrognozowana;
    private LocalDate dataRozpoczecia;
    private LocalDate planowanaDataZakonczenia;
    private LocalDate dataZakonczenia;
    private boolean czyPojazdUszkodzony;
    private int iloscPaliwa;
    private Klient daneKlienta;
    private Pojazd pojazd;
    private float koncowaOplata;

    public Wypozyczenie(int identyfikator, LocalDate planowanaDataZakonczenia, Klient daneKlienta, Pojazd pojazd) {
        this.identyfikator = identyfikator;
        this.planowanaDataZakonczenia = planowanaDataZakonczenia;
        this.daneKlienta = daneKlienta;
        this.pojazd = pojazd;
    }
    public Wypozyczenie( LocalDate planowanaDataZakonczenia, Klient daneKlienta, Pojazd pojazd) {
        this.idWypozyczenia++;
        this.planowanaDataZakonczenia = planowanaDataZakonczenia;
        this.daneKlienta = daneKlienta;
        this.pojazd = pojazd;
    }

       
    public void wyliczeniePrognozowanejCeny(){
        LocalDate aktualna_data = LocalDate.now();

        System.out.printf("Dzisiejsza data %s\n", aktualna_data.toString());
        System.out.printf("Planowana data zakonczenia %s\n", this.planowanaDataZakonczenia.toString());

        int ilosc_dni_wypozyczenia = ((int) ChronoUnit.DAYS.between(aktualna_data, this.planowanaDataZakonczenia))+1;

        System.out.printf("ilosc dni wypozycenia %d\n ", ilosc_dni_wypozyczenia);

        float cena_prognozowana = (CENA+this.pojazd.getDodatkowaCenaWypozyczenia())*ilosc_dni_wypozyczenia;

        this.setCenaPrognozowana(cena_prognozowana);

    }
    
    public int wyliczenieKoncowejCeny(){
        setKoncowaOplata(this.getCenaPrognozowana());
        return (int)this.getCenaPrognozowana();
    }
    
    public void rozpoczecieOkresuWypozyczenia(){
        LocalDate aktualna_data = LocalDate.now();
        this.setDataRozpoczecia(aktualna_data);

        this.getPojazd().setWypozyczony(true);
    }
    
    public void zakonczenieOkresuWypozyczenia(){
        LocalDate koniec = LocalDate.now();
        
        this.setDataZakonczenia(koniec);
        this.sprawdzenieStanuPojazdu();
        this.wyliczenieKoncowejCeny();
        
        System.out.printf("Do zapłaty %d\n", (int)this.getKoncowaOplata());
        
    }
    
    public void sprawdzenieStanuPojazdu(){
        
    }

    public static float getCENA() {
        return CENA;
    }

    public int getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(int identyfikator) {
        this.identyfikator = identyfikator;
    }

    public float getCenaPrognozowana() {
        return cenaPrognozowana;
    }

    public void setCenaPrognozowana(float cenaPrognozowana) {
        this.cenaPrognozowana = cenaPrognozowana;
    }

    public LocalDate getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(LocalDate dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public LocalDate getPlanowanaDataZakonczenia() {
        return planowanaDataZakonczenia;
    }

    public void setPlanowanaDataZakonczenia(LocalDate planowanaDataZakonczenia) {
        this.planowanaDataZakonczenia = planowanaDataZakonczenia;
    }

    public LocalDate getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(LocalDate dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }

    public boolean isCzyPojazdUszkodzony() {
        return czyPojazdUszkodzony;
    }

    public void setCzyPojazdUszkodzony(boolean czyPojazdUszkodzony) {
        this.czyPojazdUszkodzony = czyPojazdUszkodzony;
    }

    public int getIloscPaliwa() {
        return iloscPaliwa;
    }

    public void setIloscPaliwa(int iloscPaliwa) {
        this.iloscPaliwa = iloscPaliwa;
    }

    public Klient getDaneKlienta() {
        return daneKlienta;
    }

    public void setDaneKlienta(Klient daneKlienta) {
        this.daneKlienta = daneKlienta;
    }

    public Pojazd getPojazd() {
        return pojazd;
    }

    public void setPojazd(Pojazd pojazd) {
        this.pojazd = pojazd;
    }

    public float getKoncowaOplata() {
        return koncowaOplata;
    }

    public void setKoncowaOplata(float koncowaOpłata) {
        this.koncowaOplata = koncowaOpłata;
    }


    
    
}
