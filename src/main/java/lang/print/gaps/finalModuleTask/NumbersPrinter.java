package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {

        number = 1;

        System.out.println(number > 0);

    }

    public void printIsPositivePrintsFalseWhenZero(int number) {

        number = 0;

        System.out.println(number > 0);

    }

    public void printIsPositivePrintsFalseWhenNegative(int number) {

        number = -1;

        System.out.println(number > 0);

    }
}
