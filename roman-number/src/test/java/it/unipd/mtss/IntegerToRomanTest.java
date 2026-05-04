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
        //Arrange
        int input=0;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("", t);
    }

    @Test
    public void converTestII(){
        //Arrange
        int input=2;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("II", t);
    }

    @Test
    public void convertTestIV() {
        //Arrange
        int input=4;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("IV", t);
    }

    @Test
    public void converTestV(){
        //Arrange
        int input=5;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("V", t);
    }

    @Test 
    public void convertTestVII(){
        //Arrange
        int input=7;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("VII", t);
    }

     @Test 
    public void convertTestIX(){
        //arrange
        int input=9;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("IX", t);
    }

    @Test 
    public void convertTestX(){
        //arrange
        int input=10;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("X", t);
    }

    @Test 
    public void convertTestXIV(){
        //arrange
        int input=14;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("XIV", t);
    }

     @Test 
    public void convertTestXIX(){
        //arrange
        int input=19;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("XIX", t);
    }

     @Test 
    public void convertTestXX(){
        //arrange
        int input=20;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("XX", t);
    }

    @Test 
    public void convertTestXL(){
        //arrange
        int input=40;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("XL", t);
    }

    @Test 
    public void convertTestXLIV(){
        //arrange
        int input=44;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("XLIV", t);
    }

     @Test 
    public void convertTestXLIX(){
        //arrange
        int input=49;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("XLIX", t);
    }

     @Test 
    public void convertTestL(){
        //arrange
        int input=50;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("L", t);
    }

    @Test
    public void convertTestLX(){
        //arrange
        int input = 60;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("LX",t);
    }

    @Test
    public void convertTestLXIV(){
        //arrange
        int input = 64;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("LXIV",t);
    }

    @Test
    public void convertTestLXXIX(){
        //arrange
        int input = 79;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("LXXIX",t);
    }

    @Test
    public void convertTestLXXXIV(){
        //arrange
        int input = 84;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("LXXXIV",t);
    }

    @Test
    public void convertTestXC(){
        //arrange
        int input = 90;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("XC",t);
    }

    @Test
    public void convertTestXCIV(){
        //arrange
        int input = 94;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("XCIV",t);
    }

    @Test
    public void convertTestXCIX(){
        //arrange
        int input = 99;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("XCIX",t);
    }

    @Test
    public void convertTestC(){
        //arrange
        int input = 100;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("C",t);
    }

    @Test
    public void convertTestCXXXIX(){
        //arrange
        int input = 139;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CXXXIX",t);
    }

    @Test
    public void convertTestCXLIX(){
        //arrange
        int input = 149;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CXLIX",t);
    }

    @Test
    public void convertTestCL(){
        //arrange
        int input = 150;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CL",t);
    }

    @Test
    public void convertTestCXC(){
        //arrange
        int input = 190;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CXC",t);
    }

    @Test
    public void convertTestCXCIV(){
        //arrange
        int input = 194;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CXCIV",t);
    }

    @Test
    public void convertTestCXCIX(){
        //arrange
        int input = 199;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CXCIX",t);
    }

    @Test
    public void convertTestCCXXV(){
        //arrange
        int input = 225;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CCXXV",t);
    }

    @Test
    public void convertTestCCXLIX(){
        //arrange
        int input = 249;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CCXLIX",t);
    }

    @Test
    public void convertTestCCXCIV(){
        //arrange
        int input = 294;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CCXCIV",t);
    }

    @Test
    public void convertTestCCCIX(){
        //arrange
        int input = 309;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CCCIX",t);
    }

    @Test
    public void convertTestCCCXLIX(){
        //arrange
        int input = 349;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CCCXLIX",t);
    }

    @Test
    public void convertTestCCCLX(){
        //arrange
        int input = 360;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CCCLX",t);
    }

    @Test
    public void convertTestCDIX(){
        //arrange
        int input = 409;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CDIX",t);
    }

    @Test
    public void convertTestCDLIV(){
        //arrange
        int input = 454;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CDLIV",t);
    }

    @Test
    public void convertTestCDLXXXIX(){
        //arrange
        int input = 489;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CDLXXXIX",t);
    }

    @Test
    public void convertTestD(){
        //arrange
        int input = 500;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("D",t);
    }

    @Test
    public void convertTestDCCCLXXXVIII(){
        //arrange
        int input = 888;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("DCCCLXXXVIII",t);
    }


    @Test
    public void convertTestCM(){
        //arrange
        int input = 900;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CM",t);
    }

    @Test
    public void convertTestCMXCIX(){
        //arrange
        int input = 999;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("CMXCIX",t);
    }

    @Test
    public void convertTestM(){
        //arrange
        int input = 1000;
        //act
        String t = IntegerToRoman.convert(input);
        //assert
        assertEquals("M",t);
    }
}
