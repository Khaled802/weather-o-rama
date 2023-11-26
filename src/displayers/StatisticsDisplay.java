package displayers;

import weatherData.WeatherBasicInfo;

public class StatisticsDisplay implements Displayer, WeatherObserver {
    private Statistics statisticsTemperature;
    private Statistics statisticsHumidity;
    private Statistics statisticsPressure;

    public StatisticsDisplay() {
        statisticsTemperature = new Statistics();
        statisticsHumidity = new Statistics();
        statisticsPressure = new Statistics();

    }

    @Override
    public void display() {
        System.out.printf("Temperature -> Min: %.2f, Max: %.2f, avg: %.2f\n", statisticsTemperature.getMin(),
                statisticsTemperature.getMax(), statisticsTemperature.getAvg());
        System.out.printf("Humidity -> Min: %.2f, Max: %.2f, avg: %.2f\n", statisticsHumidity.getMin(),
                statisticsHumidity.getMax(), statisticsHumidity.getAvg());
        System.out.printf("Pressure -> Min: %.2f, Max: %.2f, avg: %.2f\n", statisticsPressure.getMin(),
                statisticsPressure.getMax(), statisticsPressure.getAvg());
    }

    @Override
    public void update(WeatherBasicInfo weatherBasicInfo) {
        statisticsTemperature.setValue(weatherBasicInfo.getTemperature());
        statisticsHumidity.setValue(weatherBasicInfo.getHumidity());
        statisticsPressure.setValue(weatherBasicInfo.getPressure());

    }

}
