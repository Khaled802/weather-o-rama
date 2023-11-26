package weatherData;

public interface WeatherBasicInfo {
    public double getHumidity();
    public double getPressure();
    public double getTemperature();

    public void setTemperature(double temperature);
    public void setHumidity(double humidity);
    public void setPressure(double pressure);
}
