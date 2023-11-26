package displayers;

import weatherData.WeatherBasicInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ForecastTemperatureDisplay implements Displayer, WeatherObserver {
    private List<Double> temperatures;
    private Random random;

    public ForecastTemperatureDisplay() {
        temperatures = new ArrayList<>();
        random = new Random();
    }

    @Override
    public void update(WeatherBasicInfo weatherBasicInfo) {
        temperatures.add(weatherBasicInfo.getTemperature());
    }

    @Override
    public void display() {
        System.out.println("predict in three days -> " + predict(1) + " " + predict(2) + " " + predict(3));
    }

    public double predict(int days) {
        double sum = temperatures.stream().reduce(0.0, (cum, ele) -> cum + ele);
        double avg = sum / temperatures.size();
        return avg + random.nextInt(days * 2 + 1) - days;
    }

}
