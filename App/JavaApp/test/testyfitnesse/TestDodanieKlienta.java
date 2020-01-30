/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnesse;

import fit.ColumnFixture;
import fit.Fixture;
import javaapp.Klient;
import javaapp.Pracownik;

/**
 *
 * @author jacek
 */
public class TestDodanieKlienta extends fit.Fixture{

    
    private String imie;
    private String nazwisko;
    private String pesel;
    private String nrTel;
    
    private String plec;
    

    
    public void execute()
    { // executed after each table row
        SetUp.aplikacja.getKlienci().add(new Klient(imie, nazwisko, pesel,nrTel, plec));
    
    }
    
    public int liczbaKlientow(){
        return SetUp.aplikacja.getKlienci().size();
    }
    
    public void setImie(String imie) {
        this.imie = imie;
    }
 
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

}