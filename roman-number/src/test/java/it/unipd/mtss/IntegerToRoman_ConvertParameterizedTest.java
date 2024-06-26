////////////////////////////////////////////////////////////////////
// Alex Shu 2082859
// Matteo Schievano 2075537
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IntegerToRoman_ConvertParameterizedTest{

    IntegerToRoman testObject=new IntegerToRoman();
    private int input;
    private String output;

    public IntegerToRoman_ConvertParameterizedTest(int input,String output)
    {
        this.input=input;
        this.output=output;
    }

    @Parameters
    public static Collection<Object[]> Input_Output()
    {
        return Arrays.asList(new Object[][]{{1,"I"},{2,"II"},{3,"III"},{4,"IV"},{6,"VI"},{9,"IX"},{10,"X"},{11,"XI"},{15,"XV"},{19,"XIX"},{20,"XX"},{27,"XXVII"},{39,"XXXIX"},{40,"XL"},{50,"L"},{99,"XCIX"},{100,"C"},{499,"CDXCIX"},{500,"D"},{999,"CMXCIX"},{1000,"M"}});
    }
    
    @Before
    public void printExecution()
    {
        System.out.printf("Executing parameterized test (IntegerToRoman)\n");
    }

    @Test
    public void TestNormalInput() throws EqualsZeroException,NegativeNumberException,OutOfSupportedNumberException
    {
        System.out.printf("Testing Convert with %d as input\n",input);
        assertEquals(output, IntegerToRoman.convert(input));
    }

}
