//////////////////////////////////////////////////////////////////////////////////////////////////////////
//  JACOPO FRANCO  2145358
//  MATTEO CETRARO 2138000
//////////////////////////////////////////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {

        String s="";
        for(int i=0; i<100; i++){
            if(number>=1){
                s += "I";
                number--;
            }
            if(number==0){
                return s;
            }
        }
        return s;
    }
    
}
