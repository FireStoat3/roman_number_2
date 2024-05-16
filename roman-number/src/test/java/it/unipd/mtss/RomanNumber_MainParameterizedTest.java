package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanNumber_MainParameterizedTest{

    private String [] input={"test"};
    private String output;

    public RomanNumber_MainParameterizedTest(String input,String output)
    {
        this.input[0]=input;
        this.output=output;
    }

    @Parameters
    public static Collection<Object[]> Input_Output()
    {
        return Arrays.asList(new Object[][]{{"1"," ____ \n" + 
                                                 "|    |\n" + 
                                                 " |  | \n" +
                                                 " |  | \n" +
                                                 " |  | \n" +
                                                 "|____|\n"},   {"2", " ____  ____ \n" +
                                                                      "|    ||    |\n" +
                                                                      " |  |  |  | \n" +
                                                                      " |  |  |  | \n" +
                                                                      " |  |  |  | \n" +
                                                                      "|____||____|\n"}, {"3"," ____  ____  ____ \n" + 
                                                                                             "|    ||    ||    |\n" + 
                                                                                             " |  |  |  |  |  | \n" + 
                                                                                             " |  |  |  |  |  | \n" + 
                                                                                             " |  |  |  |  |  | \n" + 
                                                                                             "|____||____||____|\n"}, {"4"," ____ __      __\n" +
                                                                                                                           "|    |\\ \\    / /\n" +
                                                                                                                           " |  |  \\ \\  / / \n" +
                                                                                                                           " |  |   \\ \\/ /  \n" +
                                                                                                                           " |  |    \\  /   \n" +
                                                                                                                           "|____|    \\/    \n"}, {"6","__      __ ____ \n" +
                                                                                                                                                      "\\ \\    / /|    |\n" +
                                                                                                                                                      " \\ \\  / /  |  | \n" +
                                                                                                                                                      "  \\ \\/ /   |  | \n" +
                                                                                                                                                      "   \\  /    |  | \n" +
                                                                                                                                                      "    \\/    |____|\n"},{"9"," ____ __   __\n"+
                                                                                                                                                                                  "|    |\\ \\ / /\n"+
                                                                                                                                                                                  " |  |  \\ V / \n"+
                                                                                                                                                                                  " |  |   > <  \n"+
                                                                                                                                                                                  " |  |  / . \\ \n"+
                                                                                                                                                                                  "|____||_/ \\_|\n"},{"10","__   __\n"+
                                                                                                                                                                                                            "\\ \\ / /\n"+
                                                                                                                                                                                                            " \\ V / \n"+
                                                                                                                                                                                                            "  > <  \n"+
                                                                                                                                                                                                            " / . \\ \n"+
                                                                                                                                                                                                            "|_/ \\_|\n"}});
    }
    @Before
    public void printExecution()
    {
        System.out.printf("Executing parameterized test (Main)\n");
    }

    @Test
    public void TestNormalInput() throws NoParamException, NoValidParamException, EqualsZeroException, NegativeNumberException
    {
        System.out.printf("Testing Main with %s as input\n",input[0]);
        ByteArrayOutputStream OutputCatcher = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputCatcher));
        RomanNumber.main(input);
        assertEquals(output,OutputCatcher.toString());
    }

    
}
