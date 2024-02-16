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

        Pair<Integer,String> pair = new Pair<>(1,"First");
        System.out.println(pair.getFirst());                            // 1
        System.out.println(pair.getSecond());                           // First
        System.out.println(pair);                                       // Pair{1,First}

        Number[] arr1 = new Number[] {1,2L,1.5f};
        Object[] arr2 = new Object[] {2,3L,4.5f};
        Number[] arr3 = new Number[] {1,2L,1.5};
        System.out.println(compareArrays(arr1, arr2));                  // true
        System.out.println(compareArrays(arr1, arr3));                  // false
    }

    private static <T1, T2> boolean compareArrays(T1[] arr1, T2[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].getClass().getName().equals(arr2[i].getClass().getName())) {
                return false;
            }
        }
        return true;
    }
}