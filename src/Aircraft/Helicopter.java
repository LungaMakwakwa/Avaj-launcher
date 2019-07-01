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
        //String message;
        //Sun
        if (weather.equals("SUN"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 10,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 2
            );
//            message = "Its a sunny day";
            Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + ") : Its a sunny day");
        }

        //RAIN
        else if (weather.equals("RAIN"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 5,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 0
            );
//            message = "Let it rain";
            Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + ") : Let it rain");
        }

        //FOG
        else if (weather.equals("FOG"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 1,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 0
            );
//            message = "Open you eyes cause its foggy";
            Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + ") : Open your eyes cause its foggy");
        }

        //SNOW
        else if (weather.equals("SNOW"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 0,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() - 12
            );
            //message = "Snow angels";
            Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + ") : Snow angels");
        }

//        Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + ") : ");
        if (this.coordinates.getHeight() == 0) {
            Simulator.writer.println("Helicopter#" + this.name + " (" + this.id + ") Landing.");
            //this.unregister(this);
            Simulator.writer.println("Tower says: Helicopter#" + this.name + "(" + this.id + ") Landing.");

        }



    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        Simulator.writer.println("Tower says: Helicopter#" + this.name + "(" + this.id + ") registered.");
    }
}
