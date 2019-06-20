package Aircraft.vehicle;

import Aircraft.Coordinates;
import Weather.WeatherTower;

public class Helicopter {


    //Create weatherTower class 1st
    private WeatherTower weatherTower;

    public Helicopter(String name, Coordinates coordinates)
    {
        //this.name = name;
        super(name, coordinates);
    }

    public void updateCondition()
    {
        //code update weather condition depending on vehicle type
        String weather = weatherTower.getWeather(this.coordinates);
        //Sun
        if (weather.equals("SUN"))
        {
            this.Coordinates = new Coordinates(
                coordinates.getLongitude() + 10,
                coordinates.getHeight() + 2
            )
        }

        //RAIN
        else if (weather.equals("RAIN"))
        {
            this.Coordinates = new Coordinates(
                coordinates.getLongitude() + 5
            )
        }
        
        //FOG
        else if (weather.equals("FOG"))
        {
            this.Coordinates = new Coordinates(
                coordinates.getLongitude() + 1
            )
        }

        //SNOW
        else if (weather.equals("SNOW"))
        {
            this.Coordinates = new Coordinates(
                coordinates.getHeight() - 12
            )
        }
    }
}
