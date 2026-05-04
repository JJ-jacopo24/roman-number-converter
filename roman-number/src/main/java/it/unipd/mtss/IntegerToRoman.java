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
                case 4:
                    s += "IV";
                    number -= 4;
                    continue;
                case 9:
                    s += "IX";
                    number -= 9;
                    continue;
            }
            if(number>=1000){
                s += "M";
                number -= 1000;
                continue;
            }
            if(number>=900){
                s += "CM";
                number -= 900;
                continue;
            }
            if(number>=500){
                s += "D";
                number -= 500;
                continue;
            }
            if(number>=400){
                s += "CD";
                number -= 400;
                continue;
            }
            if(number>=100){
                s += "C";
                number -= 100;
                continue;
            }
            if(number>=90){
                s += "XC";
                number -= 90;
                continue;
            }
            if(number>=50){
                s += "L";
                number -= 50;
                continue;
            }
            if(number>=40){
                    s += "XL";
                    number -= 40;
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
