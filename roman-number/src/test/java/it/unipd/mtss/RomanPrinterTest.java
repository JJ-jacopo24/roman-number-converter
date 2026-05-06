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
        String expected =
            " _____  _____ \n" +
            "|_   _||_   _|\n" +
            "  | |    | |  \n" +
            "  | |    | |  \n" +
            " _| |_  _| |_ \n" +
            "|_____||_____|\n";

        //act
        String result = RomanPrinter.print(2);
        System.out.println(RomanPrinter.print(2));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest4(){
        //arrange
        String expected =
            " _____ __      __\n" +
            "|_   _|\\ \\    / /\n" +
            "  | |   \\ \\  / / \n" +
            "  | |    \\ \\/ /  \n" +
            " _| |_    \\  /   \n" +
            "|_____|    \\/    \n";

        //act
        String result = RomanPrinter.print(4);
        System.out.println(RomanPrinter.print(4));
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
        String expected =
            "__      __ _____  _____ \n" +
            "\\ \\    / /|_   _||_   _|\n" +
            " \\ \\  / /   | |    | |  \n" +
            "  \\ \\/ /    | |    | |  \n" +
            "   \\  /    _| |_  _| |_ \n" +
            "    \\/    |_____||_____|\n";

        //act
        String result = RomanPrinter.print(7);
        System.out.println(RomanPrinter.print(7));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest10(){
        //arrange
        String expected = 
        "__   __\n" +
        "\\ \\ / /\n" +
        " \\ V / \n" +
        "  > <  \n" +
        " / ^ \\ \n" +
        "/_/ \\_\\\n";

        //act
        String result = RomanPrinter.print(10);
        System.out.println(RomanPrinter.print(10));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest19(){
        //arrange
        String expected = 
        "__   __ _____ __   __\n" +
        "\\ \\ / /|_   _|\\ \\ / /\n" +
        " \\ V /   | |   \\ V / \n" +
        "  > <    | |    > <  \n" +
        " / ^ \\  _| |_  / ^ \\ \n" +
        "/_/ \\_\\|_____|/_/ \\_\\\n";

        //act
        String result = RomanPrinter.print(19);
        System.out.println(RomanPrinter.print(19));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest40(){
        //arrange
        String expected = 
        "__   __ _      \n" +
        "\\ \\ / /| |     \n" +
        " \\ V / | |     \n" +
        "  > <  | |     \n" +
        " / ^ \\ | |____ \n" +
        "/_/ \\_\\|______|\n";

        //act
        String result = RomanPrinter.print(40);
        System.out.println(RomanPrinter.print(40));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest50(){
        //arrange
        String expected =
        " _      \n" +
        "| |     \n" +
        "| |     \n" +
        "| |     \n" +
        "| |____ \n" +
        "|______|\n";

        //act
        String result = RomanPrinter.print(50);
        System.out.println(RomanPrinter.print(50));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest56(){
        //arrange
        String expected =
        " _      __      __ _____ \n" +
        "| |     \\ \\    / /|_   _|\n" +
        "| |      \\ \\  / /   | |  \n" +
        "| |       \\ \\/ /    | |  \n" +
        "| |____    \\  /    _| |_ \n" +
        "|______|    \\/    |_____|\n";

        //act
        String result = RomanPrinter.print(56);
        System.out.println(RomanPrinter.print(56));
        //assert
        assertEquals(expected, result);
    }

@Test
    public void printTest90(){
        //arrange
        String expected =
        "__   __  _____ \n" +
        "\\ \\ / / / ____|\n" +
        " \\ V / | |     \n" +
        "  > <  | |     \n" +
        " / ^ \\ | |____ \n" +
        "/_/ \\_\\ \\_____|\n";

        //act
        String result = RomanPrinter.print(90);
        System.out.println(RomanPrinter.print(90));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest100(){
        //arrange
        String expected =
        "  _____ \n" +
        " / ____|\n" +
        "| |     \n" +
        "| |     \n" +
        "| |____ \n" +
        " \\_____|\n";

        //act
        String result = RomanPrinter.print(100);
        System.out.println(RomanPrinter.print(100));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest400(){
        //arrange
        String expected =
        "  _____  _____  \n" +
        " / ____||  __ \\ \n" +
        "| |     | |  | |\n" +
        "| |     | |  | |\n" +
        "| |____ | |__| |\n" +
        " \\_____||_____/ \n";

        //act
        String result = RomanPrinter.print(400);
        System.out.println(RomanPrinter.print(400));  
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest500(){
        //arrange
        String expected =
        " _____  \n" +
        "|  __ \\ \n" +
        "| |  | |\n" +
        "| |  | |\n" +
        "| |__| |\n" +
        "|_____/ \n";

        //act
        String result = RomanPrinter.print(500);
        System.out.println(RomanPrinter.print(500));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest888(){
        //arrange
        String expected =
        " _____    _____   _____   _____  _      __   ____   ____   ____      __ _____  _____  _____ \n" +
        "|  __ \\  / ____| / ____| / ____|| |     \\ \\ / /\\ \\ / /\\ \\ / /\\ \\    / /|_   _||_   _||_   _|\n" +
        "| |  | || |     | |     | |     | |      \\ V /  \\ V /  \\ V /  \\ \\  / /   | |    | |    | |  \n" +
        "| |  | || |     | |     | |     | |       > <    > <    > <    \\ \\/ /    | |    | |    | |  \n" +
        "| |__| || |____ | |____ | |____ | |____  / ^ \\  / ^ \\  / ^ \\    \\  /    _| |_  _| |_  _| |_ \n" +
        "|_____/  \\_____| \\_____| \\_____||______|/_/ \\_\\/_/ \\_\\/_/ \\_\\    \\/    |_____||_____||_____|\n";
        
        //act
        String result = RomanPrinter.print(888);
        System.out.println(RomanPrinter.print(888));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest900(){
        //arrange
        String expected =
        "  _____  __  __ \n" +
        " / ____||  \\/  |\n" +
        "| |     | \\  / |\n" +
        "| |     | |\\/| |\n" +
        "| |____ | |  | |\n" +
        " \\_____||_|  |_|\n";

        //act
        String result = RomanPrinter.print(900);
        System.out.println(RomanPrinter.print(900));        
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest999(){
        //arrange
        String expected =
        "  _____  __  __ __   __  _____  _____ __   __\n" +
        " / ____||  \\/  |\\ \\ / / / ____||_   _|\\ \\ / /\n" +
        "| |     | \\  / | \\ V / | |       | |   \\ V / \n" +
        "| |     | |\\/| |  > <  | |       | |    > <  \n" +
        "| |____ | |  | | / ^ \\ | |____  _| |_  / ^ \\ \n" +
        " \\_____||_|  |_|/_/ \\_\\ \\_____||_____|/_/ \\_\\\n";

        //act
        String result = RomanPrinter.print(999);
        System.out.println(RomanPrinter.print(999));
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void printTest1000(){
        //arrange
        String expected =
        " __  __ \n" +
        "|  \\/  |\n" +
        "| \\  / |\n" +
        "| |\\/| |\n" +
        "| |  | |\n" +
        "|_|  |_|\n";

        //act
        String result = RomanPrinter.print(1000);
        System.out.println(RomanPrinter.print(1000));
        //assert
        assertEquals(expected, result);
    }
}