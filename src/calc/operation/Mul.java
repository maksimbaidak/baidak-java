package calc.operation;

public class Mul implements Operation {

    @Override
    public String apply(Integer a, Integer b) {
        return String.valueOf((a * b));
    }
}
