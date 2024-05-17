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
                                                                                             "|____||____||____|\n"}, {4," ____ __      __\n" +
                                                                                                                           "|    |\\ \\    / /\n" +
                                                                                                                           " |  |  \\ \\  / / \n" +
                                                                                                                           " |  |   \\ \\/ /  \n" +
                                                                                                                           " |  |    \\  /   \n" +
                                                                                                                           "|____|    \\/    \n"}, {6,  "__      __ ____ \n" +
                                                                                                                                                      "\\ \\    / /|    |\n" +
                                                                                                                                                      " \\ \\  / /  |  | \n" +
                                                                                                                                                      "  \\ \\/ /   |  | \n" +
                                                                                                                                                      "   \\  /    |  | \n" +
                                                                                                                                                      "    \\/    |____|\n"},{9," ____ __   __\n"+
                                                                                                                                                                                "|    |\\ \\ / /\n"+
                                                                                                                                                                                " |  |  \\ V / \n"+
                                                                                                                                                                                " |  |   > <  \n"+
                                                                                                                                                                                " |  |  / . \\ \n"+
                                                                                                                                                                                "|____||_/ \\_|\n"},{10,"__   __\n"+
                                                                                                                                                                                                        "\\ \\ / /\n"+
                                                                                                                                                                                                        " \\ V / \n"+
                                                                                                                                                                                                        "  > <  \n"+
                                                                                                                                                                                                        " / . \\ \n"+
                                                                                                                                                                                                        "|_/ \\_|\n"},{11,"__   __ ____ \n" + 
                                                                                                                                                                                                                          "\\ \\ / /|    |\n" + 
                                                                                                                                                                                                                          " \\ V /  |  | \n" + 
                                                                                                                                                                                                                          "  > <   |  | \n" + 
                                                                                                                                                                                                                          " / . \\  |  | \n" +
                                                                                                                                                                                                                          "|_/ \\_||____|\n"},{15,"__   ____      __\n" + 
                                                                                                                                                                                                                                                "\\ \\ / /\\ \\    / /\n" + 
                                                                                                                                                                                                                                                " \\ V /  \\ \\  / / \n" + 
                                                                                                                                                                                                                                                "  > <    \\ \\/ /  \n" + 
                                                                                                                                                                                                                                                " / . \\    \\  /   \n" + 
                                                                                                                                                                                                                                                "|_/ \\_|    \\/    \n"},{19,"__   __ ____ __   __\n" + 
                                                                                                                                                                                                                                                                             "\\ \\ / /|    |\\ \\ / /\n" + 
                                                                                                                                                                                                                                                                             " \\ V /  |  |  \\ V / \n" + 
                                                                                                                                                                                                                                                                             "  > <   |  |   > <  \n" + 
                                                                                                                                                                                                                                                                             " / . \\  |  |  / . \\ \n" + 
                                                                                                                                                                                                                                                                             "|_/ \\_||____||_/ \\_|\n"},{20,"__   ____   __\n" + 
                                                                                                                                                                                                                                                                                                            "\\ \\ / /\\ \\ / /\n" + 
                                                                                                                                                                                                                                                                                                            " \\ V /  \\ V / \n" + 
                                                                                                                                                                                                                                                                                                            "  > <    > <  \n" + 
                                                                                                                                                                                                                                                                                                            " / . \\  / . \\ \n" +
                                                                                                                                                                                                                                                                                                            "|_/ \\_||_/ \\_|\n"},{27,"__   ____   ____      __ ____  ____ \n"+ 
                                                                                                                                                                                                                                                                                                                                        "\\ \\ / /\\ \\ / /\\ \\    / /|    ||    |\n"+
                                                                                                                                                                                                                                                                                                                                        " \\ V /  \\ V /  \\ \\  / /  |  |  |  | \n"+
                                                                                                                                                                                                                                                                                                                                        "  > <    > <    \\ \\/ /   |  |  |  | \n"+
                                                                                                                                                                                                                                                                                                                                        " / . \\  / . \\    \\  /    |  |  |  | \n"+ 
                                                                                                                                                                                                                                                                                                                                        "|_/ \\_||_/ \\_|    \\/    |____||____|\n"},{39,"__   ____   ____   __ ____ __   __\n" + 
                                                                                                                                                                                                                                                                                                                                                                                        "\\ \\ / /\\ \\ / /\\ \\ / /|    |\\ \\ / /\n" + 
                                                                                                                                                                                                                                                                                                                                                                                        " \\ V /  \\ V /  \\ V /  |  |  \\ V / \n" + 
                                                                                                                                                                                                                                                                                                                                                                                        "  > <    > <    > <   |  |   > <  \n" + 
                                                                                                                                                                                                                                                                                                                                                                                        " / . \\  / . \\  / . \\  |  |  / . \\ \n" +
                                                                                                                                                                                                                                                                                                                                                                                        "|_/ \\_||_/ \\_||_/ \\_||____||_/ \\_|\n"},{40,"__   __  _    \n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                          "\\ \\ / / | |   \n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                          " \\ V /  | |   \n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                          "  > <   | |   \n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                          " / . \\  | |__ \n" +
                                                                                                                                                                                                                                                                                                                                                                                                                                          "|_/ \\_| |____|\n"},{50,"  _    \n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " | |   \n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " | |   \n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " | |   \n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " | |__ \n" +
                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " |____|\n"},{99,"__   __  ____  ____ __   __\n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    "\\ \\ / / / ___||    |\\ \\ / /\n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " \\ V / | |     |  |  \\ V / \n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    "  > <  | |     |  |   > <  \n" + 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " / . \\ | |___  |  |  / . \\ \n" +
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    "|_/ \\_| \\____||____||_/ \\_|\n"},{100,"  ____ \n" +
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " / ___|\n" +
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               "| |    \n" +
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               "| |    \n" +
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               "| |___ \n" +
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " \\____|\n"}});
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