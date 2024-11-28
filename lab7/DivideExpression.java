package lab7;
/**
 * The {@code lab7.DivideExpression} class implement the {@link Expression} interface
 * <p>
 * The division
 * This class provides an implementation of the {@link #interpret()} method to preform a specific operation defined
 * in {@link Expression#interpret()}
 * </p>
 */
public class DivideExpression implements Expression {
    private Expression left;
    private Expression right;
    /**
     * Constructor of the {@link DivideExpression} class, put the left and right expression to create one.
     * */
    public DivideExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    /**
     * {@link DivideExpression#interpret()} method, return the division of left and right parts.
     * */
    @Override
    public int interpret(){
        return left.interpret() / right.interpret();
    }
}
