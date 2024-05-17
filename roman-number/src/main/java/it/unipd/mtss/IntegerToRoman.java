////////////////////////////////////////////////////////////////////
// Alex Shu 2082859
// Matteo Schievano 2075537
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;


public class IntegerToRoman{
    public static String convert(int number) throws EqualsZeroException,NegativeNumberException,OutOfSupportedNumberException
    {

        if(number==0)
        {
            throw new EqualsZeroException("number equals 0");
        }
        else if(number<0)
        {
            throw new NegativeNumberException("negative number");
        }
        else if(number>1000)
        {
            throw new OutOfSupportedNumberException("Inserted number is higher than 1000");
        }

        String result="";
        String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I",};
        int arabic[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
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
