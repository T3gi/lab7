import lab7.*;

public class Main {
    public static void main(String[] args) {
        String expression = "2 4 5 + 3 - * 1 /"; //2 * (4 + 5 - 3) / 1
        int result = RPNInterpreter.parseExpression(expression);
        System.out.println(result);
    }
}
