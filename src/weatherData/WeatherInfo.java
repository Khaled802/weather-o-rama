package weatherData;

public class WeatherInfo implements WeatherBasicInfo {
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherInfo(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this. pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    
}
