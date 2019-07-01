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


    @Override
    public void updateConditions() {
        //code update weather condition depending on vehicle type
        //Sun
        //String message;

        String weather = weatherTower.getWeather(this.coordinates);
        if (weather.equals("SUN"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 10,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 2
            );
            //message = "Its a sunny day";
            Simulator.writer.println("Jetplane#" + this.name + "(" + this.id + ") : Its a sunny day");
        }

        //RAIN
        else if (weather.equals("RAIN"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 0,
                    coordinates.getLatitude() + 5,
                    coordinates.getHeight() + 0
            );
            //message = "Let it rain";
            Simulator.writer.println("Jetplane#" + this.name + "(" + this.id + ") : Let it rain");
        }

        //FOG
        else if (weather.equals("FOG"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 0,
                    coordinates.getLatitude() + 1,
                    coordinates.getHeight() + 0
            );
            //message = "Open you eyes cause its foggy";
            Simulator.writer.println("Jetplane#" + this.name + "(" + this.id + ") : Open your eyes cause its foggy");
        }

        //SNOW
        else if (weather.equals("SNOW"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 0,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() - 7
            );
            //message = "Snow angels";
            Simulator.writer.println("Jetplane#" + this.name + "(" + this.id + ") : Snow angels");

        }

        //Simulator.writer.println("Jetplane#" + this.name + "(" + this.id + ") : " + message);
        if (this.coordinates.getHeight() == 0) {
            Simulator.writer.println("Jetplane#" + this.name + " (" + this.id + ") Landing.");
            this.weatherTower.unregister(this);
            Simulator.writer.println("Tower says: Jetplane#" + this.name + "(" + this.id + ")  unregistered from weather tower.");

        }

        //Simulator.writer.println("|-------------------------------------------------------------------------------------------|");
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        Simulator.writer.println("Tower says: Jetplane#" + this.name + "(" + this.id + ") registered.");
        //Simulator.writer.println("|-------------------------------------------------------------------------------------------|");
    }
}
