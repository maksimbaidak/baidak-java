package calc;

import calc.operation.*;

public class Calculator {

    /**
     * Calculates the result of the given operation using the provided integers.
     *
     * @param  a             the first integer operand
     * @param  b             the second integer operand
     * @param  operationName the name of the operation to be performed
     * @return              the result of the operation
     */
    public static String calculate(Integer a, Integer b, String operationName) throws Exception {
        Operation operation;
        switch (operationName) {
            case "+":
                operation = new Sum();
                break;
            case "-":
                operation = new Sub();
                break;
            case "*":
                operation = new Mul();
                break;
            case "/":
                operation = new Div();
                break;
            case "=":
                operation = new Compare();
                break;
            default:
                throw new Exception("Unknown operation");
        }
        return operation.apply(a, b);
    }
}
