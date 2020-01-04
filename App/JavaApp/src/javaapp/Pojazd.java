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
public class Pojazd {
    
    private String marka;
    private String model;
    private int rokProdukcji;
    private int przebieg;
    private int pojemnoscSilnika;
    private int pojemnoscBaku;
    private boolean czyWypozyczony;
    private float sredniaOcena;
    private float dodatkowaCenaWypozyczenia;

    public Pojazd(String marka, String model, int rokProdukcji, int przebieg, int pojemnoscSilnika, int pojemnoscBaku, boolean czyWypozyczony, float sredniaOcena, float dodatkowaCenaWypozyczenia) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.pojemnoscBaku = pojemnoscBaku;
        this.czyWypozyczony = czyWypozyczony;
        this.sredniaOcena = sredniaOcena;
        this.dodatkowaCenaWypozyczenia = dodatkowaCenaWypozyczenia;
    }
    
    public void ocenieniePojazdu(){
        
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getPojemnoscBaku() {
        return pojemnoscBaku;
    }

    public void setPojemnoscBaku(int pojemnoscBaku) {
        this.pojemnoscBaku = pojemnoscBaku;
    }

    public boolean isCzyWypozyczony() {
        return czyWypozyczony;
    }

    public void setCzyWypozyczony(boolean czyWypozyczony) {
        this.czyWypozyczony = czyWypozyczony;
    }

    public float getSredniaOcena() {
        return sredniaOcena;
    }

    public void setSredniaOcena(float sredniaOcena) {
        this.sredniaOcena = sredniaOcena;
    }

    public float getDodatkowaCenaWypozyczenia() {
        return dodatkowaCenaWypozyczenia;
    }

    public void setDodatkowaCenaWypozyczenia(float dodatkowaCenaWypozyczenia) {
        this.dodatkowaCenaWypozyczenia = dodatkowaCenaWypozyczenia;
    }

    
    
}
