//////////////////////////////////////////////////////////////////////////////////////////////////////////
//  JACOPO FRANCO  2145358
//  MATTEO CETRARO 2138000
//////////////////////////////////////////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {

        String s="";
        for(int i=0; i<100; i++){
            switch(number){
                case 0:
                    return s;
                case 9:
                    s += "IX";
                    number -= 9;
                    continue;
                case 4:
                    s += "IV";
                    number -= 4;
                    continue;
            }
            if(number>=10){
                s += "X";
                number -= 10;
                continue;
            }
            if(number>=5){
                s += "V";
                number -= 5;
                continue;
            }
            if(number>=1){
                s += "I";
                number--;
                continue;
            }
        }
        return s;
    }
    
}
