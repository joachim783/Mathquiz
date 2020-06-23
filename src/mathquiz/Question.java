/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathquiz;

/**
 *
 * @author 459258562
 */
public class Question implements Comparable<Question> {
    
    private int leftOP;
    private int rightOP;
    private String Operator;
    private int Answer;
    
    public Question (int leftOP,int rightOP, String Operator)
    {
        this.leftOP = leftOP;
        this.rightOP = rightOP;
        this.Operator = Operator;
        this.Answer = answercalc();
    }
    
    public int getanswer()
    {
        return Answer;
    }
    
    public int answercalc ()
    {
        switch (Operator) {
            case "+":
                Answer = leftOP + rightOP;
                break;
            case "-":
                Answer = leftOP - rightOP;
                break;
            case "*":
                Answer = leftOP * rightOP;
                break;
            case "/":
                Answer = leftOP / rightOP;
                break;
            default:
                break;
        }
        return Answer;
    }
    // method returns string version of question (gets sent to client app)
    // e.g. "1+1=2"
    @Override
    public String toString()
    {
        return leftOP + " " + Operator + " " + rightOP + " = " + Answer;
    }
    
    // compareTo() --- interface Comparator
    public int compareTo (Question q)
    {
        if (Answer > q.Answer)
        {
            return 1;
        }
        else if (Answer < q.Answer)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
