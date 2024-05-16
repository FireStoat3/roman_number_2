////////////////////////////////////////////////////////////////////
// Alex Shu 2082859
// Matteo Schievano 2075537
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;


public class IntegerToRoman{
    public static String convert(int number) throws EqualsZeroException,NegativeNumberException
    {

        if(number==0)
        {
            throw new EqualsZeroException("number equals 0");
        }
        else if(number<0)
        {
            throw new NegativeNumberException("negative number");
        }

        String result="";
        String roman[]={"X","IX","V","IV","I",};
        int arabic[]={10,9,5,4,1};
        int index=0;

        while(number>0||index<arabic.length)
        {
            if(arabic[index]<=number)
            {
                result+=roman[index];
                number-=arabic[index];
            }
            else
            {
                index+=1;
            }
        }
        return result;
    }
}
