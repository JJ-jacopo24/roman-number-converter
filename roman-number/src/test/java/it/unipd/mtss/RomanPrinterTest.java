//////////////////////////////////////////////////////////////////////////////////////////////////////////
//  JACOPO FRANCO  2145358
//  MATTEO CETRARO 2138000
//////////////////////////////////////////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanPrinterTest {

    @Test
    public void printTest1() {
        //arrange
        String expected =
        " _____ \n" +
        "|_   _|\n" +
        "  | |  \n" +
        "  | |  \n" +
        " _| |_ \n" +
        "|_____|\n";

        //act
        String result = RomanPrinter.print(1);
        System.out.println(RomanPrinter.print(1));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest2() {
        //arrange
        String I =
        " _____ \n" +
        "|_   _|\n" +
        "  | |  \n" +
        "  | |  \n" +
        " _| |_ \n" +
        "|_____|\n";

        String expected = I + I;
        //act
        String result = RomanPrinter.print(2);
        System.out.println(RomanPrinter.print(2));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest5(){
        //arrange
        String expected =
        "__      __\n" +
        "\\ \\    / /\n" +
        " \\ \\  / / \n" +
        "  \\ \\/ /  \n" +
        "   \\  /   \n" +
        "    \\/    \n";

        //act
        String result = RomanPrinter.print(5);
        System.out.println(RomanPrinter.print(5));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest7(){
        //arrange
        String V =
        "__      __\n" +
        "\\ \\    / /\n" +
        " \\ \\  / / \n" +
        "  \\ \\/ /  \n" +
        "   \\  /   \n" +
        "    \\/    \n";
        String I =
        " _____ \n" +
        "|_   _|\n" +
        "  | |  \n" +
        "  | |  \n" +
        " _| |_ \n" +
        "|_____|\n";

        String expected = V + I + I;

        //act
        String result = RomanPrinter.print(7);
        System.out.println(RomanPrinter.print(7));
        //assert
        assertEquals(expected, result);
    }
}