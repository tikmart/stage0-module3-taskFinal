package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {

        int remainder = number % 10;
        int reverse = 0*10 + remainder;
        number = number /10;

        remainder = number % 10;
        reverse = reverse * 10 + remainder;

        number = number / 10;

        remainder = number % 10;
        reverse = reverse * 10 + number;

        System.out.println( reverse);

    }

    public static void main(String [] args) {

        revert(457);
        revert(334);
    }
}
