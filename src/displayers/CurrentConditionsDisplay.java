package displayers;

import weatherData.WeatherBasicInfo;

public class CurrentConditionsDisplay implements Displayer, WeatherObserver {
    private double temperature;
    private double humidity;

    @Override
    public void update(WeatherBasicInfo weatherBasicInfo) {
        temperature = weatherBasicInfo.getTemperature();
        humidity = weatherBasicInfo.getHumidity();
    }

    @Override
    public void display() {
        System.out.printf("temperature: %.2f, humidity: %.2f\n", temperature, humidity);
    }
    
}
