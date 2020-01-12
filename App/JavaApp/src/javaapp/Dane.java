/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author tomek
 */
public class Dane {
    
    public String daneKlientow[][] = new String[][] {
        {"Anna", "Jopek", "123456789","987654321", "K"},
        {"Jan", "Kowalski", "00000000000", "000000000","M"},
        {"Pawel", "Nowak", "11111111111","111111111", "M"},
        {"Michal", "Rodzyn", "22222222222","222222222", "M"},
        {"Michalina", "Rodzyn", "22222222223","222222223", "K"}
    };

    public static Klient klienci[] = {
        new Klient("Anna", "Jopek", "123456789","987654321", "K"),
        new Klient("Jan", "Kowalski", "00000000000", "000000000", "M"),
        new Klient("Pawel", "Nowak", "11111111111","111111111", "M"),
        new Klient("Michal", "Rodzyn", "22222222222","222222222", "M"),
        new Klient("Michalina", "Rodzyn", "22222222223","222222223", "K")
    };
            
            
            
    public String danePracownikow[][] = new String[][] {
        {"Marcin", "Kucharz", "33333333333","333333333"},
        {"Dawid", "Nos", "44444444444","444444444"},
        {"Jakub", "Cichy", "55555555555","555555555"}};
    
    public String danePojazdow[][] = new String[][] {
        {"0", "Nissan","Juke", "2017", "50000", "1.6f", "46", "false", "0.0f", "50.0f"},
        {"1", "Audi","B5", "1997", "200000", "1.9f", "60", "false", "0.0f", "20.0f"},
        {"2", "Renault","Megane", "1995", "215000", "1.5f", "50", "false", "0.0f", "17.0f"}};
    
    //public cenyPojazdow{}
        
        


}
        
        

