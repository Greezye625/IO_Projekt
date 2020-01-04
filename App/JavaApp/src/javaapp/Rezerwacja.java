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
public class Rezerwacja {
    private String imieKlienta;
    private String nazwiskoKlienta;
    private String peselKlienta;
    private Pojazd zarezerwowanyPojazd;
    private String planowanaDataRozpoczecia;

    public Rezerwacja(String imieKlienta, String nazwiskoKlienta, String peselKlienta, Pojazd zarezerwowanyPojazd, String planowanaDataRozpoczecia) {
        this.imieKlienta = imieKlienta;
        this.nazwiskoKlienta = nazwiskoKlienta;
        this.peselKlienta = peselKlienta;
        this.zarezerwowanyPojazd = zarezerwowanyPojazd;
        this.planowanaDataRozpoczecia = planowanaDataRozpoczecia;
    }
    
    
}
