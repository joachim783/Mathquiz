/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import mathquiz.*;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author 459258562
 */
@RunWith (Parameterized.class)
public class UnitTestMathFunctionality {
    
    private Question question;
    private final int leftOP;
    private final String Operator;
    private final int rightOP;
    private final int Answer;
    
    
    public UnitTestMathFunctionality(int leftOP,int rightOP, String Operator, int Answer) {
        this.leftOP = leftOP;
        this.rightOP = rightOP;
        this.Operator = Operator;
        this.Answer = Answer;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Parameterized.Parameters
    public static Collection primeNumbers ()
    {
        return Arrays.asList(new Object[][] {
            { 1, 1, "+", 2},
            { 100, 50, "-", 50},
            { 2, 2, "*", 4},
            { 8, 2, "/", 4}
            
        });
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void MathTesting() 
    {
        question = new Question(leftOP, rightOP, Operator);
        assertEquals(Answer, question.getanswer());
        System.out.println(Answer + " Equals: " + question.getanswer());
    }
}
