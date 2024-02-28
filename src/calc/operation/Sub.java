package calc.operation;

public class Sub implements Operation {

    @Override
    public String apply(Integer a, Integer b) {
        return String.valueOf((a - b));
    }
}
