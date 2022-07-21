package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void toFahrenheit(int temperatureCelsius){



        float farenheit = ((float) temperatureCelsius * 1.8F) +32;

        System.out.println(farenheit);
    }
    public static void main(String[] args) {
        toFahrenheit(1);
        toFahrenheit(5);
    }
}
