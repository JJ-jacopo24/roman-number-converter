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
        String t = IntegerToRoman.convert(3);
        assertEquals("III", t);
    }

}
