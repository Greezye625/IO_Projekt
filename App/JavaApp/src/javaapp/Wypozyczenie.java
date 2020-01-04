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
public class Wypozyczenie {
    private float cenaPrognozowana;
    private String dataRozpoczecia;
    private String planowanaDataZakonczenia;
    private String dataZakonczenia;
    private boolean czyPojazdUszkodzony;
    private int iloscPaliwa;
    private Klient daneKlienta;
    private Pojazd pojazd;
    private float koncowaOplata;

    public Wypozyczenie(float cenaPrognozowana, String dataRozpoczecia, String planowanaDataZakonczenia, boolean czyPojazdUszkodzony, Klient daneKlienta, Pojazd pojazd) {
        this.cenaPrognozowana = cenaPrognozowana;
        this.dataRozpoczecia = dataRozpoczecia;
        this.planowanaDataZakonczenia = planowanaDataZakonczenia;
        this.czyPojazdUszkodzony = czyPojazdUszkodzony;
        this.daneKlienta = daneKlienta;
        this.pojazd = pojazd;
    }

       
    public void wyliczeniePrognozowanejCeny(){
        
    }
    
    public void wyliczenieKoncowejCeny(){
        
    }
    
    public void rozpoczecieOkresuWypozyczenia(){
        
    }
    
    public void zakonczenieOkresuWypozyczenia(){
        
    }
    
    public void sprawdzenieStanuPojazdu(){
        
    }
    
    public float getCenaPrognozowana() {
        return cenaPrognozowana;
    }

    public void setCenaPrognozowana(float cenaPrognozowana) {
        this.cenaPrognozowana = cenaPrognozowana;
    }

    public String getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(String dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public String getPlanowanaDataZakonczenia() {
        return planowanaDataZakonczenia;
    }

    public void setPlanowanaDataZakonczenia(String planowanaDataZakonczenia) {
        this.planowanaDataZakonczenia = planowanaDataZakonczenia;
    }

    public String getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(String dataZakonczenia) {
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
