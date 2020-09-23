package org.example;


import static org.junit.Assert.*;
import org.junit.Test;

public class RomanNumberTest {

    // Test para los numeros romanos

    //Comprobamos los enum Types creados.
    @Test
    public void readEnums() {


        assertEquals(50, RomanSymbols.L.getValue());
    }


/*    @Test
    public void readNumbers() {
        String numeroMil = "UMU";

        assertEquals(1000, readRomanNumberValue(numeroMil));

    }*/
}
