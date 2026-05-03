//////////////////////////////////////////////////////////////////////////////////////////////////////////
//  JACOPO FRANCO  2145358
//  MATTEO CETRARO 2138000
//////////////////////////////////////////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void convertTest() {
        IntegerToRoman integer = new IntegerToRoman();
        String t = IntegerToRoman.convert(2);
        assertEquals("II", t);
    }

    @Test
    public void convertTest0() {
        IntegerToRoman integer = new IntegerToRoman();
        String t = IntegerToRoman.convert(4);
        assertEquals("IV", t);
    }

    @Test
    public void converTest2(){
        IntegerToRoman integer = new IntegerToRoman();
        String t = IntegerToRoman.convert(5);
        assertEquals("V",t);
    }

    @Test 
    public void convertTestVII(){
        //Arrange
        int input=7;
        String expected="VII";
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("VII", t);
    }

     @Test 
    public void convertTestIX(){
        //Arrange
        int input=9;
        String expected="IX";
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("IX", t);
    }

     @Test 
    public void convertTestX(){
        //Arrange
        int input=10;
        String expected="X";
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("X", t);
    }
}
