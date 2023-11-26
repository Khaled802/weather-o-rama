import displayers.CurrentConditionsDisplay;
import displayers.ForecastTemperatureDisplay;
import displayers.StatisticsDisplay;
import weatherData.WeatherBasicInfo;
import weatherData.WeatherData;
import weatherData.WeatherInfo;

public class App {
    public static void main(String[] args) throws Exception {
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();

        WeatherBasicInfo weatherInfo = new WeatherInfo(23, 49.3, 2.4);
        WeatherData weatherData = new WeatherData(weatherInfo);

        weatherData.addObserver(currentConditionsDisplay);
        currentConditionsDisplay.display();

        weatherInfo.setHumidity(44.6);
        weatherData.notifyObservers();
        currentConditionsDisplay.display();


        ForecastTemperatureDisplay forecastTemperatureDisplay = new ForecastTemperatureDisplay();
        weatherData.addObserver(forecastTemperatureDisplay);
        forecastTemperatureDisplay.display();

        weatherInfo.setTemperature(30);
        weatherData.notifyObservers();
        currentConditionsDisplay.display();
        forecastTemperatureDisplay.display();

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        weatherData.addObserver(statisticsDisplay);
        weatherData.removeObserver(currentConditionsDisplay);
        weatherInfo.setTemperature(25);
        weatherData.notifyObservers();
        currentConditionsDisplay.display();
        forecastTemperatureDisplay.display();
        statisticsDisplay.display();
        
    }
}
