package calc.operation;

public class Compare implements Operation {

    @Override
    public String apply(Integer a, Integer b) {
        int result = a.compareTo(b);
        switch (result) {
            case 0:
                return a + "=" + b;
            case 1:
                return a + ">" + b;
            default:
                return a + "<" + b;
        }
    }
}
