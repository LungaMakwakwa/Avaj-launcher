package Aircraft;

import Weather.WeatherTower;

public class Baloon extends Aircraft implements Flyable{

    //Create weatherTower class 1st
    private WeatherTower weatherTower;


    public Baloon(String name, Coordinates coordinates)
    {
        //this.name = name;
        super(name, coordinates);
    }

    public void updateCondition()
    {
        //code update weather condition depending on vehicle type
        String weather = weatherTower.getWeather(this.coordinates);

        //if (weather.equals("SUN"))this.coordinates = new Coordinates(coordinates.getLongitude() + 2,coordinates.getLatitude() + 0,coordinates.getHeight() + 4); 
        //update for all conditions
        //Sun
        if (weather.equals("SUN"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 2,
                    coordinates.getHeight() + 4,
                    coordinates.getHeight() + 0
            );
        }

        //RAIN Maunga12@makwash@
        else if (weather.equals("RAIN"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getHeight() - 5,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 0
            );
        }
        
        //FOG
        else if (weather.equals("FOG"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getHeight() - 3,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 0
            );
        }

        //SNOW
        else if (weather.equals("SNOW"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getHeight() - 15,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 0
            );
        }
    }

    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
