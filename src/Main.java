public class Main {
    public static void main(String[] args) {
        Object o = Calculator.sum(1.0f, 1.0f);
        System.out.println(o.getClass().getSimpleName() + ": " + o);    // Long: 2

        o = Calculator.sum(1.5f, 1);
        System.out.println(o.getClass().getSimpleName() + ": " + o);    // Double: 2.5

        o = Calculator.subtract(1.0f, 1.0f);
        System.out.println(o.getClass().getSimpleName() + ": " + o);    // Long: 0

        o = Calculator.subtract(1.5f, 1);
        System.out.println(o.getClass().getSimpleName() + ": " + o);    // Double: 0.5

        o = Calculator.multyply(1.0f, 1.0f);
        System.out.println(o.getClass().getSimpleName() + ": " + o);    // Long: 1

        o = Calculator.multyply(1.5f, 2);
        System.out.println(o.getClass().getSimpleName() + ": " + o);    // Long: 3

        o = Calculator.divide(1.0f, 1.0f);
        System.out.println(o.getClass().getSimpleName() + ": " + o);    // Long: 1

        o = Calculator.divide(1.5f, 2);
        System.out.println(o.getClass().getSimpleName() + ": " + o);    // Double: 0.75

    }
}