public class Calculator {

    public static <T1 extends Number, T2 extends Number> Number sum(T1 t1, T2 t2) {
        Double d = t1.doubleValue() + t2.doubleValue();
        if (isLong(d)) {
            return Math.round(d);
        } else {
            return d;
        }
    }

    public static <T1 extends Number, T2 extends Number> Number subtract(T1 t1, T2 t2) {
        Double d = t1.doubleValue() - t2.doubleValue();
        if (isLong(d)) {
            return Math.round(d);
        } else {
            return d;
        }
    }

    public static <T1 extends Number, T2 extends Number> Number multyply(T1 t1, T2 t2) {
        Double d = t1.doubleValue() * t2.doubleValue();
        if (isLong(d)) {
            return Math.round(d);
        } else {
            return d;
        }
    }

    public static <T1 extends Number, T2 extends Number> Number divide(T1 t1, T2 t2) {
        Double d = t1.doubleValue() / t2.doubleValue();
        if (isLong(d)) {
            return Math.round(d);
        } else {
            return d;
        }
    }

    private static <T1 extends Number> boolean isLong(T1 value) {
        return (value.doubleValue() % 1 == 0);
    }

}
