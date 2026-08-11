public class NumberChecker {

    public void check(int num) {
        if (num % 2 == 0 && num > 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
public class Main {

    public static void main(String[] args) {

        NumberChecker obj = new NumberChecker();

        obj.check(14);
    }
}
