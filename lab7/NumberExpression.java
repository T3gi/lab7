package lab7;
/**
 * The {@code lab7.NumberExpression} class implement the {@link Expression} interface
 * <p>
 * The number
 * This class provides an implementation of the {@link #interpret()} method to preform a specific operation defined
 * in {@link Expression#interpret()}
 * </p>
 */
public class NumberExpression implements Expression {
    private int num;
    /**
     * Constructor of the {@link NumberExpression} class, put the number to create one.
     * */
    public NumberExpression(int num) {
        this.num = num;
    }
    /**
     * {@link NumberExpression#interpret()} method, return the number.
     * */
    @Override
    public int interpret(){
        return num;
    }
}
