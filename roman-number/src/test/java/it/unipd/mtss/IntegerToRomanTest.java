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
    public void convertTestXC(){
        int input = 90;
        String t = IntegerToRoman.convert(input);
        assertEquals("XC",t);
    }

    @Test
    public void convertTestXCIV(){
        int input = 94;
        String t = IntegerToRoman.convert(input);
        assertEquals("XCIV",t);
    }

    @Test
    public void convertTestXCIX(){
        int input = 99;
        String t = IntegerToRoman.convert(input);
        assertEquals("XCIX",t);
    }

    @Test
    public void convertTestC(){
        int input = 100;
        String t = IntegerToRoman.convert(input);
        assertEquals("C",t);
    }

    @Test
    public void convertTestCXXXIX(){
        int input = 139;
        String t = IntegerToRoman.convert(input);
        assertEquals("CXXXIX",t);
    }

    @Test
    public void convertTestCXLIX(){
        int input = 149;
        String t = IntegerToRoman.convert(input);
        assertEquals("CXLIX",t);
    }

    @Test
    public void convertTestCL(){
        int input = 150;
        String t = IntegerToRoman.convert(input);
        assertEquals("CL",t);
    }

    @Test
    public void convertTestCXC(){
        int input = 190;
        String t = IntegerToRoman.convert(input);
        assertEquals("CXC",t);
    }

    @Test
    public void convertTestCXCIV(){
        int input = 194;
        String t = IntegerToRoman.convert(input);
        assertEquals("CXCIV",t);
    }

    @Test
    public void convertTestCXCIX(){
        int input = 199;
        String t = IntegerToRoman.convert(input);
        assertEquals("CXCIX",t);
    }

    @Test
    public void convertTestCCXXV(){
        int input = 225;
        String t = IntegerToRoman.convert(input);
        assertEquals("CCXXV",t);
    }

    @Test
    public void convertTestCCXLIX(){
        int input = 249;
        String t = IntegerToRoman.convert(input);
        assertEquals("CCXLIX",t);
    }

    @Test
    public void convertTestCCXCIV(){
        int input = 294;
        String t = IntegerToRoman.convert(input);
        assertEquals("CCXCIV",t);
    }

    @Test
    public void convertTestCCCIX(){
        int input = 309;
        String t = IntegerToRoman.convert(input);
        assertEquals("CCCIX",t);
    }

    @Test
    public void convertTestCCCXLIX(){
        int input = 349;
        String t = IntegerToRoman.convert(input);
        assertEquals("CCCXLIX",t);
    }

    @Test
    public void convertTestCCCLX(){
        int input = 360;
        String t = IntegerToRoman.convert(input);
        assertEquals("CCCLX",t);
    }

    @Test
    public void convertTestCDIX(){
        int input = 409;
        String t = IntegerToRoman.convert(input);
        assertEquals("CDIX",t);
    }

    @Test
    public void convertTestCDLIV(){
        int input = 454;
        String t = IntegerToRoman.convert(input);
        assertEquals("CDLIV",t);
    }

    @Test
    public void convertTestCDLXXXIX(){
        int input = 489;
        String t = IntegerToRoman.convert(input);
        assertEquals("CDLXXXIX",t);
    }

    @Test
    public void convertTestD(){
        int input = 500;
        String t = IntegerToRoman.convert(input);
        assertEquals("D",t);
    }
}
