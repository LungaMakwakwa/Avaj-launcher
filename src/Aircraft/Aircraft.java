package Aircraft;

public class Aircraft {

    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    //Get back to adding the next id function
}
