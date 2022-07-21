package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {

        int sum = number % 10;

        number = number / 10;
        sum = sum + number % 10;

        number = number / 10;
        sum = sum + number % 10;

        number = number / 10;

        sum = sum + number;

        System.out.println(sum);
    }


    public static void main (String [] args){

        calculateSum(1111);
        calculateSum(4567);
    }



    }

