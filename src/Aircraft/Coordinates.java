package Aircraft;

public class Coordinates {

    private int longitude;
    private int latitude;
    private int height;

    public Coordinates(int longitude, int latitude, int height) {

        if (latitude < 0)
        {
            latitude = 0;
        }

        else if (longitude < 0)
        {
            longitude = 0;
        }

        else if (height < 0)
        {
            height = 0;
        }

        else if (height > 100)
        {
            height = 100;
        }
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }

}

