package Aircraft;

import Weather.Simulator;
import Weather.WeatherTower;


public class Jetplane extends Aircraft implements Flyable{

    //Create weatherTower class 1st
    private WeatherTower weatherTower;

    public Jetplane(String name, Coordinates coordinates)
    {
        //this.name = name;
        super(name, coordinates);
    }


    //@Override
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

        Simulator.writer.println("Jetplane#" + this.name + "(" + this.id + ") : ");
        if (this.coordinates.getHeight() == 0) {
            Simulator.writer.println("Jetplane#" + this.name + " (" + this.id + ") Landing.");
            //this.unregister(this); unregister aircraft
            Simulator.writer.println("Tower says: Jetplane#" + this.name + "(" + this.id + ") Landing.");

        }
    }

    //@Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        Simulator.writer.println("Tower says: Jetplane#" + this.name + "(" + this.id + ") registered.");
    }
}
