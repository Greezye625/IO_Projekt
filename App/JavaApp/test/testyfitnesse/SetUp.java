/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnesse;
import javaapp.Aplikacja;
import fit.Fixture;
import java.util.ArrayList;
import javaapp.Klient;
import javaapp.Pojazd;
import javaapp.Pracownik;
/**
 *
 * @author jacek
 */
public class SetUp extends Fixture{
    static Aplikacja aplikacja;
    static Pracownik pracownik;
    static ArrayList<Klient> klienci;
    static ArrayList<Pracownik> pracownicy;
    static ArrayList<Pojazd> pojazdy ;
    
    public SetUp(){
        aplikacja = new Aplikacja();
       pracownicy = new ArrayList<>();
        klienci = new ArrayList<>();
        aplikacja.setKlienci(klienci);pojazdy = new ArrayList<Pojazd>();
        aplikacja.setPojazdy(pojazdy);
        aplikacja.setPracownicy(pracownicy);
//   

    }

}