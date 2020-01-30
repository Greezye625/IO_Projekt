/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnesse;

import fit.ColumnFixture;
import fit.Fixture;
import javaapp.Pracownik;

/**
 *
 * @author jacek
 */
public class TestDodaniePracownika extends fit.Fixture{

    
    private String imie;
    private String nazwisko;
    private String pesel;
    private String nrTel;
    
    public void AddPracownik(){
        SetUp.aplikacja.getPracownicy().add(new Pracownik(imie, nazwisko, pesel, nrTel));
    }
    
    public void execute()
    { // executed after each table row
        SetUp.aplikacja.getPracownicy().add(new Pracownik(imie, nazwisko, pesel, nrTel));
    
    }
    
    public int liczbaPrac(){
        return SetUp.aplikacja.getPracownicy().size();
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

}