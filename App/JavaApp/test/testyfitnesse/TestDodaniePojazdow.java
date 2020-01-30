/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnesse;

import fit.ColumnFixture;
import fit.Fixture;
import javaapp.Pojazd;
import javaapp.Pracownik;

/**
 *
 * @author jacek
 */
public class TestDodaniePojazdow extends fit.Fixture{

    
    private String id;
    private String marka;
    private String model;
    private int rocznik;
    private String przebieg;
    private float pojSilnika;
    private int pojBaku;
    
    
    public void execute()
    { // executed after each table row
        SetUp.aplikacja.getPojazdy().add(
                new Pojazd(id, marka, model, rocznik, Integer.parseInt(przebieg), pojSilnika, pojBaku ,false, 0.0f, 50.0f) );
    }
  
    public int liczbaPojazdow(){
        return SetUp.aplikacja.getPojazdy().size();
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param marka the marka to set
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @param rocznik the rocznik to set
     */
    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    /**
     * @param przebieg the przebieg to set
     */
    public void setPrzebieg(String przebieg) {
        this.przebieg = przebieg;
    }

    /**
     * @param pojSilnika the pojSilnika to set
     */
    public void setPojSilnika(float pojSilnika) {
        this.pojSilnika = pojSilnika;
    }

    /**
     * @param pojBaku the pojBaku to set
     */
    public void setPojBaku(int pojBaku) {
        this.pojBaku = pojBaku;
    }
    
}