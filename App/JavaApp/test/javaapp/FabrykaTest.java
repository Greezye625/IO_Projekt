/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import java.util.IllegalFormatCodePointException;

import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
/**
 *
 * @author tomek
 */
public class FabrykaTest {
    Dane dane;
    @Before
    public void setUp(){
    dane= new Dane();
    }
    
    @Test
    public void testDodajKlienta(){
     System.out.println("dodaj Klienta");
    Fabryka instance = new Fabryka();
    
    
    for (int i = 0; i < 4; i++) {
        Klient result = instance.stworzKlienta(dane.daneKlientow[i]);
        result.wyswietlDaneKlienta();
        dane.klienci[i].wyswietlDaneKlienta();
        assertEquals(dane.klienci[i], result); //k1.1 – test poprawności tworzonych produktów
    }
    }
}
    

