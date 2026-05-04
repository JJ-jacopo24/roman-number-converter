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
        String risultato = "";
      
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

        Map<Integer, String> mappa = new HashMap<>();
        mappa.put(0, " ");
        mappa.put(1, "-");
        mappa.put(2, "|");
        mappa.put(3, "_");
        mappa.put(4, "\\");
        mappa.put(5, "/");

        for (char c : romanNumber.toCharArray()) {

            if (c == 'I') {
                for (int[] riga : I) { //per ogni riga di I

                    //ausiliara che aiuta per mappare le righe una alla volta
                    String rigaString = "";

                    for (int val : riga) { //per ogni valore di una riga
                        rigaString += mappa.get(val); //aggiungo i valori mappati alla stringa
                    }
                    
                    //aggiungo ogni riga alla stringa risultato andando a capo per ogni riga analizzata
                    risultato += rigaString + "\n"; 
                }
            }
            if(c == 'V'){
                for(int[] riga : V){
                    String rigaString = "";
                    for(int val : riga){
                        rigaString += mappa.get(val);
                    }
                    risultato += rigaString + "\n";
                }
            }
            if(c == 'L'){
                for(int[] riga : L){
                    String rigaString = "";
                    for(int val : riga){
                        rigaString += mappa.get(val);
                    }
                    risultato += rigaString + "\n";
                }
            }
            if(c == 'M'){
                for(int[] riga : M){
                    String rigaString = "";
                    for(int val : riga){
                        rigaString += mappa.get(val);
                    }
                    risultato += rigaString + "\n";
                }
            }
        }

        return risultato;

    }
}


