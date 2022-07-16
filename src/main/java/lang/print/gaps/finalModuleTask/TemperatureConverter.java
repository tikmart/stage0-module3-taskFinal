package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){

        temperatureCelsius = 1;

        float farenheit = ((float) temperatureCelsius * 1.8F) +32;

        System.out.println(farenheit);
    }
    public void fiveToFahrenheit(int temperatureCelsius){

        temperatureCelsius = 5;

        float farenheit = ((float) temperatureCelsius * 1.8F) +32;

        System.out.println(farenheit);
    }
}
