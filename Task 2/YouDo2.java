public class YouDo2 {

    public static void main(String[] args) {

        NumberChecker obj = new NumberChecker();

        obj.check(14);
    }
}

class NumberChecker {

    public void check(int num) {

        if (num % 2 == 0 && num > 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
