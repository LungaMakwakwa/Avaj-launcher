package Weather;

import Aircraft.Coordinates;

public class WeatherTower {

    public String getWeather(Coordinates coordinates)
    {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    void changeWeather()
    {
        this.conditionChanged();
    }

    private void conditionChanged() {
    }


}
