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
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("VII", t);
    }

     @Test 
    public void convertTestIX(){
        //Arrange
        int input=9;
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("IX", t);
    }

    @Test 
    public void convertTestX(){
        //Arrange
        int input=10;
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("X", t);
    }

    @Test 
    public void convertTestXIV(){
        //Arrange
        int input=14;
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("XIV", t);
    }

     @Test 
    public void convertTestXIX(){
        //Arrange
        int input=19;
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("XIX", t);
    }

     @Test 
    public void convertTestXX(){
        //Arrange
        int input=20;
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("XX", t);
    }

    @Test 
    public void convertTestXL(){
        //Arrange
        int input=40;
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("XL", t);
    }

    @Test 
    public void convertTestXLIV(){
        //Arrange
        int input=44;
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("XLIV", t);
    }

     @Test 
    public void convertTestXLIX(){
        //Arrange
        int input=49;
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("XLIX", t);
    }

     @Test 
    public void convertTestL(){
        //Arrange
        int input=50;
        //Act
        String t = IntegerToRoman.convert(input);
        //Assert
        assertEquals("L", t);
    }
}
