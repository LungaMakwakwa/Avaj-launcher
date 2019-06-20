package Aircraft.vehicle;

import Aircraft.Coordinates;
import Weather.WeatherTower;

public class Jetplane {

    //Create weatherTower class 1st
    private WeatherTower weatherTower;

    public Jetplane(String name, Coordinates coordinates)
    {
        //this.name = name;
        super(name, coordinates);
    }

    public void updateCondition()
    {
        //code update weather condition depending on vehicle type
        //Sun
        if (weather.equals("SUN"))
        {
            this.Coordinates = new Coordinates(
                coordinates.getLatitude() + 10,
                coordinates.getHeight() + 2
            )
        }

        //RAIN
        else if (weather.equals("RAIN"))
        {
            this.Coordinates = new Coordinates(
                coordinates.getLatitude() + 5
            )
        }
        
        //FOG
        else if (weather.equals("FOG"))
        {
            this.Coordinates = new Coordinates(
                coordinates.getLatitude() + 1
            )
        }

        //SNOW
        else if (weather.equals("SNOW"))
        {
            this.Coordinates = new Coordinates(
                coordinates.getHeight() - 7
            )
        }
    }
}
