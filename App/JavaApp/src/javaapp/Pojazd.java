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

    private String identyfikator;
    private String marka;
    private String model;
    private int rokProdukcji;
    private int przebieg;
    private float pojemnoscSilnika;
    private int pojemnoscBaku;
    private boolean Wypozyczony;
    private float sredniaOcena;
    private float dodatkowaCenaWypozyczenia;

    public Pojazd(String identyfikator, String marka, String model, int rokProdukcji, int przebieg, float pojemnoscSilnika, int pojemnoscBaku, boolean Wypozyczony, float sredniaOcena, float dodatkowaCenaWypozyczenia) {
        this.identyfikator = identyfikator;
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.pojemnoscBaku = pojemnoscBaku;
        this.Wypozyczony = Wypozyczony;
        this.sredniaOcena = sredniaOcena;
        this.dodatkowaCenaWypozyczenia = dodatkowaCenaWypozyczenia;
    }

    public void printOpis(){
        System.out.println("------------------------");
        System.out.printf("Pojazd id. %s \n", this.identyfikator);
        System.out.format("%s %s %dr \n",this.marka,this.model,this.rokProdukcji);
        System.out.printf("Przebieg %dkm \n", this.przebieg);
        System.out.printf("Silnik %.1fL \n", this.pojemnoscSilnika);
        System.out.printf("Pojemnosc baku %dL \n", this.pojemnoscBaku);
        if(this.Wypozyczony){
            System.out.println("Niedostepny");
        }
        else{
            System.out.println("Dostepny");
        }
        System.out.printf("Ocena %.1f\n",this.sredniaOcena);
        System.out.printf("Dodatkowa cena wypozyczenia: %.2fzl\n",this.dodatkowaCenaWypozyczenia);
    }

    public void ocenieniePojazdu(){
        
    }

    public String getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(String identyfikator) {
        this.identyfikator = identyfikator;
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

    public float getPojemnoscSilnika() {
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

    public boolean isWypozyczony() {
        return Wypozyczony;
    }

    public void setWypozyczony(boolean wypozyczony) {
        this.Wypozyczony = wypozyczony;
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
