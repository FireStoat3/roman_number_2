////////////////////////////////////////////////////////////////////
// Alex Shu 2082859
// Matteo Schievano 2075537
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

//import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RomanPrinter_PrintTest 
{

    private int input;

    @Before
    public void BeforeMessage()
    {
        System.out.println("Executing Print function special test\n");
    }

    @Test(expected = EqualsZeroException.class)
    public void TestZeroAsInput() throws EqualsZeroException, NegativeNumberException, OutOfSupportedNumberException
    {
        input=0;
        System.out.printf("Testing Print with %d as input\n",input);
        RomanPrinter.print(input);
    }

    @Test(expected = NegativeNumberException.class)
    public void TestNegativeAsInput() throws EqualsZeroException, NegativeNumberException, OutOfSupportedNumberException
    {
        input=-1;
        System.out.printf("Testing Print with %d as input\n",input);
        RomanPrinter.print(input);
    }

    @Test(expected = OutOfSupportedNumberException.class)
    public void TestNotSupportedNumber() throws EqualsZeroException, NegativeNumberException, OutOfSupportedNumberException
    {
        input=1001;
        System.out.printf("Testing Print with %d as input\n", input);
        RomanPrinter.print(input);
    }
}