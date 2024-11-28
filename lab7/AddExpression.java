package lab7;
/**
 * The {@code lab7.AddExpression} class implement the {@link Expression} interface
 * <p>
 * The sum
 * This class provides an implementation of the {@link #interpret()} method to preform a specific operation defined
 * in {@link Expression#interpret()}
 * </p>
 */
public class AddExpression implements Expression {
    private Expression left;
    private Expression right;
    /**
     * Constructor of the {@link AddExpression} class, put the left and right expression to create one.
     * */
    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    /**
     * {@link AddExpression#interpret()} method, return the sum of left and right parts.
     * */
    @Override
    public int interpret(){
        return left.interpret() + right.interpret();
    }
}
