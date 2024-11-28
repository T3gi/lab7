package lab7;
/**
 * The {@code lab7.SubstractExpression} class implement the {@link Expression} interface
 * <p>
 * The substraction
 * This class provides an implementation of the {@link #interpret()} method to preform a specific operation defined
 * in {@link Expression#interpret()}
 * </p>
 */
public class SubstractExpression implements Expression {
    private Expression left;
    private Expression right;
    /**
     * Constructor of the {@link SubstractExpression} class, put the left and right expression to create one.
     * */
    public SubstractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    /**
     * {@link SubstractExpression#interpret()} method, return the substraction of left and right parts.
     * */
    @Override
    public int interpret(){
        return left.interpret() - right.interpret();
    }
}
