package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        number = 457;

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
}
