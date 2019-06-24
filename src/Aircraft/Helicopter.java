package Aircraft;

import Aircraft.Coordinates;
import Weather.Simulator;
import Weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {


    //Create weatherTower class 1st
    private WeatherTower weatherTower;

    public Helicopter(String name, Coordinates coordinates)
    {
        //this.name = name;
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        //code update weather condition depending on vehicle type
        String weather = weatherTower.getWeather(this.coordinates);
        //Sun
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
                    coordinates.getLongitude() + 5,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 0
            );
        }

        //FOG
        else if (weather.equals("FOG"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 1,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 0
            );
        }

        //SNOW
        else if (weather.equals("SNOW"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getHeight() - 12,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 0
            );
        }

        Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + ") : ");
        if (this.coordinates.getHeight() == 0) {
            Simulator.writer.println("Helicopter#" + this.name + " (" + this.id + ") Landing.");
            //this.unregister(this); unregister aircraft
            Simulator.writer.println("Tower says: Helicopter#" + this.name + "(" + this.id + ") Landing.");

        }



    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower.register(this);
        Simulator.writer.println("Tower says: Helicopter#" + this.name + "(" + this.id + ") registered.");
    }
}
