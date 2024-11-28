package lab7;
/**
 * The {@code lab7.MultiplyExpression} class implement the {@link Expression} interface
 * <p>
 * The multiply
 * This class provides an implementation of the {@link #interpret()} method to preform a specific operation defined
 * in {@link Expression#interpret()}
 * </p>
 */
public class MultiplyExpression implements Expression {
    private Expression left;
    private Expression right;
    /**
     * Constructor of the {@link MultiplyExpression} class, put the left and right expression to create one.
     * */
    public MultiplyExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    /**
     * {@link SubstractExpression#interpret()} method, return the multiplication of left and right parts.
     * */
    @Override
    public int interpret(){
        return left.interpret() * right.interpret();
    }

}
