package Aircraft;

import Aircraft.Coordinates;
import Weather.WeatherTower;

public class Jetplane extends Aircraft implements Flyable{

    //Create weatherTower class 1st
    private WeatherTower weatherTower;

    public Jetplane(String name, Coordinates coordinates)
    {
        //this.name = name;
        super(name, coordinates);
    }

    public void updateCondition()
    {

    }

    @Override
    public void updateConditions() {
        //code update weather condition depending on vehicle type
        //Sun

        String weather = weatherTower.getWeather(this.coordinates);
        if (weather.equals("SUN"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 10,
                    coordinates.getLatitude() + 2,
                    coordinates.getHeight() + 0
            );
        }

        //RAIN
        else if (weather.equals("RAIN"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 10,
                    coordinates.getLatitude() + 2,
                    coordinates.getHeight() + 0
            );
        }

        //FOG
        else if (weather.equals("FOG"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 10,
                    coordinates.getLatitude() + 2,
                    coordinates.getHeight() + 0
            );
        }

        //SNOW
        else if (weather.equals("SNOW"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 10,
                    coordinates.getLatitude() + 2,
                    coordinates.getHeight() + 0
            );
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
