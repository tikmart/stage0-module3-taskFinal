package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public static void printIsPositive(int number) {

        System.out.println(number > 0);

    }

    public static void main(String[] args) {
        printIsPositive(1);
        printIsPositive(0);
        printIsPositive(-1);
    }
}
