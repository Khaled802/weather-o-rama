package weatherData;

import displayers.WeatherObserver;

public interface WeatherSubject {
    void addObserver(WeatherObserver weatherObserver);    
    void removeObserver(WeatherObserver weatherObserver);
    void notifyObservers();
}
