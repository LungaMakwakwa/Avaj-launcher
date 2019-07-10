package Aircraft;

abstract public class Aircraft {

    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;
    
    private long nextId()
    {
        return ++(Aircraft.idCounter);
    }

    protected Aircraft(String name, Coordinates coordinates) {
        this.id = this.nextId();
        this.name = name;
        this.coordinates = coordinates;
    }

}