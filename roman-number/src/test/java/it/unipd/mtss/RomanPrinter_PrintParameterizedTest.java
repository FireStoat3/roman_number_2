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
public class RomanPrinter_PrintParameterizedTest {

    private int input;
    private String output;

    public RomanPrinter_PrintParameterizedTest(int input,String output)
    {
        this.input=input;
        this.output=output;
    }

    @Parameters
    public static Collection<Object[]> Input_Output()
    {
        return Arrays.asList(new Object[][]{{1,  " ____ \n" + 
                                                 "|    |\n" + 
                                                 " |  | \n" +
                                                 " |  | \n" +
                                                 " |  | \n" +
                                                 "|____|\n"},   {2,   " ____  ____ \n" +
                                                                      "|    ||    |\n" +
                                                                      " |  |  |  | \n" +
                                                                      " |  |  |  | \n" +
                                                                      " |  |  |  | \n" +
                                                                      "|____||____|\n"}, {3, " ____  ____  ____ \n" + 
                                                                                             "|    ||    ||    |\n" + 
                                                                                             " |  |  |  |  |  | \n" + 
                                                                                             " |  |  |  |  |  | \n" + 
                                                                                             " |  |  |  |  |  | \n" + 
                                                                                             "|____||____||____|\n"}});
    }
    
    @Before
    public void printExecution()
    {
        System.out.printf("Executing parameterized test (RomanPrinter_Print)\n");
    }

    @Test
    public void ParameterizedTestExecution() throws EqualsZeroException, NegativeNumberException
    {
        System.out.printf("Testing Print with %d as input\n",input);
        assertEquals(output, RomanPrinter.print(input));
    }

}