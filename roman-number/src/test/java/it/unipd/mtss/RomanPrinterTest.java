//////////////////////////////////////////////////////////////////////////////////////////////////////////
//  JACOPO FRANCO  2145358
//  MATTEO CETRARO 2138000
//////////////////////////////////////////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanPrinterTest {

    @Test
    public void print1() {
        String expected =
        " _____ \n" +
        "|_   _|\n" +
        "  | |  \n" +
        "  | |  \n" +
        " _| |_ \n" +
        "|_____|\n";


        System.out.println(RomanPrinter.print(1));
        assertEquals(expected, RomanPrinter.print(1));
    }

    @Test
    public void print2() {
        String I =
        " _____ \n" +
        "|_   _|\n" +
        "  | |  \n" +
        "  | |  \n" +
        " _| |_ \n" +
        "|_____|\n";

        String expected = I + I;
        System.out.println(RomanPrinter.print(2));
        assertEquals(expected, RomanPrinter.print(2));
    }
}