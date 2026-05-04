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
        int input=7;
        String t = IntegerToRoman.convert(input);
        assertEquals("VII", t);
    }

     @Test 
    public void convertTestIX(){
        int input=9;
        String t = IntegerToRoman.convert(input);
        assertEquals("IX", t);
    }

    @Test 
    public void convertTestX(){
        int input=10;
        String t = IntegerToRoman.convert(input);
        assertEquals("X", t);
    }

    @Test 
    public void convertTestXIV(){
        int input=14;
        String t = IntegerToRoman.convert(input);
        assertEquals("XIV", t);
    }

     @Test 
    public void convertTestXIX(){
        int input=19;
        String t = IntegerToRoman.convert(input);
        assertEquals("XIX", t);
    }

     @Test 
    public void convertTestXX(){
        int input=20;
        String t = IntegerToRoman.convert(input);
        assertEquals("XX", t);
    }

    @Test 
    public void convertTestXL(){
        int input=40;
        String t = IntegerToRoman.convert(input);
        assertEquals("XL", t);
    }

    @Test 
    public void convertTestXLIV(){
        int input=44;
        String t = IntegerToRoman.convert(input);
        assertEquals("XLIV", t);
    }

     @Test 
    public void convertTestXLIX(){
        int input=49;
        String t = IntegerToRoman.convert(input);
        assertEquals("XLIX", t);
    }

     @Test 
    public void convertTestL(){
        int input=50;
        String t = IntegerToRoman.convert(input);
        assertEquals("L", t);
    }

    @Test
    public void convertTestLX(){
        int input = 60;
        String t = IntegerToRoman.convert(input);
        assertEquals("LX",t);
    }

    @Test
    public void convertTestLXIV(){
        int input = 64;
        String t = IntegerToRoman.convert(input);
        assertEquals("LXIV",t);
    }

    @Test
    public void convertTestLXXIX(){
        int input = 79;
        String t = IntegerToRoman.convert(input);
        assertEquals("LXXIX",t);
    }

    @Test
    public void convertTestLXXXIV(){
        int input = 84;
        String t = IntegerToRoman.convert(input);
        assertEquals("LXXXIV",t);
    }

    @Test
    public void convertTestCX(){
        int input = 90;
        String t = IntegerToRoman.convert(input);
        assertEquals("CX",t);
    }

    @Test
    public void convertTestCXIV(){
        int input = 94;
        String t = IntegerToRoman.convert(input);
        assertEquals("CXIV",t);
    }

    @Test
    public void convertTestCXIX(){
        int input = 99;
        String t = IntegerToRoman.convert(input);
        assertEquals("CXIX",t);
    }
}
