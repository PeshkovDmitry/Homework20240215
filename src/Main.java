public class Main {
    public static void main(String[] args) {
        Object o = Calculator.add(1, 1);
        System.out.println(o);
        System.out.println(o.getClass().getSimpleName());

    }
}