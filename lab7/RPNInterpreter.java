package lab7;

import java.util.Stack;
/**
 * The {@code lab7.RPNInterpreter} class
 * The calculator
 */
public class RPNInterpreter {
    /**
     * {@link RPNInterpreter#parseExpression(String)} method, put the context, get the result.
     * */
    public static int parseExpression(String context) {
        String[] tokens = context.split(" ");
        Stack<Expression> Expressionstack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                Expressionstack.push(new NumberExpression(Integer.parseInt(token)));
            } else if (token.equals("+")) {
                Expression right = Expressionstack.pop();
                Expression left = Expressionstack.pop();
                Expressionstack.push(new AddExpression(left, right));
            } else if (token.equals("-")) {

                Expression right = Expressionstack.pop();
                Expression left = Expressionstack.pop();
                Expressionstack.push(new SubstractExpression(left, right));
            } else if (token.equals("*")) {
                Expression right = Expressionstack.pop();
                Expression left = Expressionstack.pop();
                Expressionstack.push(new MultiplyExpression(left, right));
            } else if (token.equals("/")) {
                Expression right = Expressionstack.pop();
                Expression left = Expressionstack.pop();
                Expressionstack.push(new DivideExpression(left, right));
            }
        }
        return Expressionstack.pop().interpret();
    }
}


