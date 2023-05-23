package Consumer;

public class Automobile {

    private int id;
    private String brand;
    private String series;
    private int year;


    public Automobile(int id, String brand, String series, int year) {
        super();
        this.id = id;
        this.brand = brand;
        this.series = series;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return brand;
    }

    public void setName(String name) {
        this.brand = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [id= " + id + "\n brand= " + brand + "\n series= " + series + "\n year= " + year + "]\n";
    }
}

