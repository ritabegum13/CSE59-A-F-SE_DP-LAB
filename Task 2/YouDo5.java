public class YouDo5 {

    public static void main(String[] args) {

        Printer printer = new Printer();

        printer.printData("Hello, World!");
        printer.printData(100);
    }
}

class Printer {

    public void printData(String text) {
        System.out.println(text);
    }

    public void printData(int number) {
        System.out.println(number);
    }
}
