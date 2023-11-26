package weatherData;

import java.util.HashSet;
import java.util.Set;

import displayers.WeatherObserver;

public class WeatherData implements WeatherSubject{
    private WeatherBasicInfo weatherBasicInfo;
    private Set<WeatherObserver> weatherObservers;

    public WeatherData(WeatherBasicInfo weatherBasicInfo) {
        this.weatherBasicInfo = weatherBasicInfo;
        weatherObservers = new HashSet<>();
    }

    public void setWeatherUpdate(WeatherBasicInfo weatherBasicInfo) {
        this.weatherBasicInfo = weatherBasicInfo;
        notifyObservers();
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
        weatherObserver.update(weatherBasicInfo);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver weatherObserver : weatherObservers) {
            weatherObserver.update(weatherBasicInfo);
        }
    }

    
}
