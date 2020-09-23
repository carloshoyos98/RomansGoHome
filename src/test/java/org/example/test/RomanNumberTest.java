package org.example.test;


import static org.junit.Assert.*;

import org.example.src.RomanNumber;
import org.example.src.RomanSymbols;
import org.junit.Test;

public class RomanNumberTest {

    // Test para los numeros romanos

    //Comprobamos los enum Types creados.
    @Test
    public void readEnums() {


        assertEquals(50, RomanSymbols.L.getValue());
    }

    @Test
    public void createRomanNumber() {
        String number = "CXV"; //115

        RomanNumber romanNumber = new RomanNumber(number);
        //Valor decimal 0 porque aún no se ha leído y contado el numero romano.
        assertEquals(0, romanNumber.getDecimalValue());

    }
}
