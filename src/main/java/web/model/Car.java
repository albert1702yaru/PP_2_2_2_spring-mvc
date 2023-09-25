package web.model;

public class Car {
    public String model;
    private final int series;
    private final int year;

    public Car(String model, int series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getYear() {
        return year;
    }
}