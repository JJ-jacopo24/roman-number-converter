//////////////////////////////////////////////////////////////////////////////////////////////////////////
//  JACOPO FRANCO  2145358
//  MATTEO CETRARO 2138000
//////////////////////////////////////////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    public static String print(int num) {

        return printAsciiArt(IntegerToRoman.convert(num));

    }

    private static String printAsciiArt(String romanNumber) {
        String[] linee ={"","","","","",""};
       
        Map<Integer, String> mappa = new HashMap<>();
        mappa.put(0, " ");
        mappa.put(1, "-");
        mappa.put(2, "|");
        mappa.put(3, "_");
        mappa.put(4, "\\");
        mappa.put(5, "/");
        mappa.put(6, ">");
        mappa.put(7, "<");
        mappa.put(8, "V");
        mappa.put(9, "^");

        int[][] I = {
            {0,3,3,3,3,3,0},
            {2,3,0,0,0,3,2},
            {0,0,2,0,2,0,0},
            {0,0,2,0,2,0,0},
            {0,3,2,0,2,3,0},
            {2,3,3,3,3,3,2}
        };

        int[][] V = {
            {3,3,0,0,0,0,0,0,3,3},
            {4,0,4,0,0,0,0,5,0,5},
            {0,4,0,4,0,0,5,0,5,0},
            {0,0,4,0,4,5,0,5,0,0},
            {0,0,0,4,0,0,5,0,0,0},
            {0,0,0,0,4,5,0,0,0,0}
        };

        
        int[][] X = {
            	{3,3,0,0,0,3,3},
            	{4,0,4,0,5,0,5},
            	{0,4,0,8,0,5,0},
            	{0,0,6,0,7,0,0},
            	{0,5,0,9,0,4,0},
            	{5,3,5,0,4,3,4}
        };


        int[][] L ={
            {0,3,0,0,0,0,0,0},
            {2,0,2,0,0,0,0,0},
            {2,0,2,0,0,0,0,0},
            {2,0,2,0,0,0,0,0},
            {2,0,2,3,3,3,3,0},
            {2,3,3,3,3,3,3,2}
        };

        int[][] M ={
            {0,3,3,0,0,3,3,0},
            {2,0,0,4,5,0,0,2},
            {2,0,4,0,0,5,0,2},
            {2,0,2,4,5,2,0,2},
            {2,0,2,0,0,2,0,2},
            {2,3,2,0,0,2,3,2}
        };

        Map<Character, int[][]> lettere = new HashMap<>();
        lettere.put('I', I);
        lettere.put('V', V);
        lettere.put('X', X);
        lettere.put('L', L);
       
        
        lettere.put('M', M);


        for (char c : romanNumber.toCharArray()) {

            int[][] matriceLett=lettere.get(c);

            for (int i=0; i<6; i++){
                for(int val:matriceLett[i]){
                    linee[i] +=mappa.get(val);
                }
            }
        }
        String risultato="";
        for(int i=0; i<6; i++){
            risultato+=linee[i]+ "\n";
        }
        return risultato;

    }
}


