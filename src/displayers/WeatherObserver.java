package displayers;

import weatherData.WeatherBasicInfo;

public interface WeatherObserver {
    void update(WeatherBasicInfo weatherBasicInfo);
}
