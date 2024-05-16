////////////////////////////////////////////////////////////////////
// Alex Shu 2082859
// Matteo Schievano 2075537
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {

    public static String print(int num) throws EqualsZeroException, NegativeNumberException
    {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber)
    {
        String result="";
        //#=inizio riga, ?=fine riga
        HashMap<String,String> RomanToAsciiArt = new HashMap<String,String>();
        RomanToAsciiArt.put("I"," ____ |    | |  |  |  |  |  | |____|");
        RomanToAsciiArt.put("V","__      __\\ \\    / / \\ \\  / /   \\ \\/ /     \\  /       \\/    ");    
        RomanToAsciiArt.put("X","__   __\\ \\ / / \\ V /   > <   / . \\ |_/ \\_|");   
        int romanNumberIndex=0;
        String AsciiArtLine="";
        int LineLength=0; //lunghezza di una riga del carattere in AsciiArt

        for(int i=0;i<6;i+=1)
        {
            while(romanNumberIndex<romanNumber.length())
            {
                AsciiArtLine=RomanToAsciiArt.get(romanNumber.substring(romanNumberIndex,romanNumberIndex+1));
                //calcolo lunghezza linea del carattere
                LineLength=AsciiArtLine.length()/6;
                result+=AsciiArtLine.substring(i*LineLength,i*LineLength+LineLength);
                romanNumberIndex+=1;
            }
            result+="\n";
            romanNumberIndex=0;
        }

        return result;
    }
}
