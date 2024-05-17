////////////////////////////////////////////////////////////////////
// Alex Shu 2082859
// Matteo Schievano 2075537
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

import org.junit.Before;
import org.junit.Test;

public class RomanNumber_MainTest
{  

    private String[] input={""};

    @Before
    public void BeforeMessage()
    {
        System.out.println("Executing Main function special test\n");
    }


    @Test(expected=NoValidParamException.class)
    public void TestMainWrongString() throws NoParamException, NoValidParamException, EqualsZeroException, NegativeNumberException, OutOfSupportedNumberException
    {
        System.out.printf("Testing Main with a non valid string...\n");
        input[0]="Not_A_Valid_String";
        RomanNumber.main(input);
    }

    @Test(expected=NoParamException.class)
    public void TestMainEmptyString() throws NoParamException, NoValidParamException, EqualsZeroException, NegativeNumberException, OutOfSupportedNumberException
    {
        System.out.printf("Testing Main with null string...\n");
        String[] ZeroStringInput=new String[0];
        RomanNumber.main(ZeroStringInput);
    }

    @Test(expected=NoValidParamException.class)
    public void TestMainSpaceOnlyString() throws NoParamException, NoValidParamException, EqualsZeroException, NegativeNumberException, OutOfSupportedNumberException
    {
        System.out.printf("Testing Main with only space string...\n");
        input[0]="       ";
        RomanNumber.main(input);
    }

    @Test(expected=EqualsZeroException.class)
    public void TestZeroAsInput() throws NoParamException, NoValidParamException, EqualsZeroException, NegativeNumberException, OutOfSupportedNumberException
    {
        input[0]="0";
        System.out.printf("Testing Main with %s as input...\n",input[0]);
        RomanNumber.main(input);
    }

    @Test(expected=NegativeNumberException.class)
    public void TestNegativeNumberAsInput() throws NoParamException, NoValidParamException, EqualsZeroException, NegativeNumberException, OutOfSupportedNumberException
    {
        input[0]="-1";
        System.out.printf("Testing Main with %s as input...\n", input[0]);
        RomanNumber.main(input);
    }

    @Test(expected = OutOfSupportedNumberException.class)
    public void TestNotSupportedNumber() throws NoParamException, NoValidParamException, EqualsZeroException, NegativeNumberException, OutOfSupportedNumberException
    {
        input[0]="1001";
        System.out.printf("Testing Main with %s as input\n", input[0]);
        RomanNumber.main(input);
    }
}