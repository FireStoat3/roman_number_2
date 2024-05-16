////////////////////////////////////////////////////////////////////
// Alex Shu 2082859
// Matteo Schievano 2075537
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanNumber 
{
    public static void main(String[] args) throws NoParamException, NoValidParamException, EqualsZeroException, NegativeNumberException
    {
        if(args.length==0)
        {
            throw new NoParamException("No number as parameter passed. Can't continue.");
        }

        int NumberToConvert=0;

        try
        {
            NumberToConvert=Integer.parseInt(args[0]);
        }
        catch (NumberFormatException exc)
        {
            throw new NoValidParamException("String parameter not valid. Can't continue.");
        }

        System.out.printf(RomanPrinter.print(NumberToConvert));

    }
}
