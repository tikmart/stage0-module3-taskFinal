package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        number = 1111;
        int sum = number % 10;

        number = number / 10;
        sum = sum + number % 10;

        number = number / 10;
        sum = sum + number % 10;

        number = number / 10;

        sum = sum + number;

        System.out.println(sum);
    }

    public void calculateSumCalculatesSumFor4567(int number) {
        number = 4567;
        int sum = number % 10;

        number = number / 10;
        sum = sum + number % 10;

        number = number / 10;
        sum = sum + number % 10;

        number = number / 10;

        sum = sum + number;

        System.out.println(sum);

    }
}
