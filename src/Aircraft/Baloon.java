package Aircraft;

import Weather.Simulator;
import Weather.WeatherTower;

public class Baloon extends Aircraft implements Flyable{

    //Create weatherTower class 1st
    private WeatherTower weatherTower;


    public Baloon(String name, Coordinates coordinates)
    {
        //this.name = name;
        super(name, coordinates);
    }

//    public void updateCondition()
//    {
//
//    }

    @Override
    public void updateConditions() {
        //code update weather condition depending on vehicle type
        String weather = weatherTower.getWeather(this.coordinates);
        //String message;

        //if (weather.equals("SUN"))this.coordinates = new Coordinates(coordinates.getLongitude() + 2,coordinates.getLatitude() + 0,coordinates.getHeight() + 4);
        //update for all conditions
        //Sun
        if (weather.equals("SUN"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 2,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() + 4
            );
            //message = "Its a sunny day";
            Simulator.writer.println("Baloon#" + this.name + "(" + this.id + ") : Its a sunny day");
        }

        //RAIN Maunga12@makwash@
        else if (weather.equals("RAIN"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 0,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() - 5
            );
            //message = "Let it rain";
            Simulator.writer.println("Baloon#" + this.name + "(" + this.id + ") : Let it rain");
        }

        //FOG
        else if (weather.equals("FOG"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 0,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() - 3
            );
            //message = "Open you eyes cause its foggy";
            Simulator.writer.println("Baloon#" + this.name + "(" + this.id + ") : Open your eyes cause its foggy");
        }

        //SNOW
        else if (weather.equals("SNOW"))
        {
            this.coordinates = new Coordinates(
                    coordinates.getLongitude() + 0,
                    coordinates.getLatitude() + 0,
                    coordinates.getHeight() - 15
            );
            //message = "Snow angels";
            Simulator.writer.println("Baloon#" + this.name + "(" + this.id + ") : Snow angels");
        }

        //Simulator.writer.println("Baloon#" + this.name + "(" + this.id + ") : " + message);
        if (this.coordinates.getHeight() == 0) {
            Simulator.writer.println("Baloon#" + this.name + " (" + this.id + ") Landing.");
            this.weatherTower.unregister(this);
            Simulator.writer.println("Tower says: Baloon#" + this.name + "(" + this.id + ") Landing.");

        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower){
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        Simulator.writer.println("Tower says: Baloon#" + this.name + "(" + this.id + ") registered.");
    }
}
