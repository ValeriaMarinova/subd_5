package repository;

public class CarsCount {
    private String brand;
    private String model;
    private String engine;
    private int power;
    private Long count;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public CarsCount(String brand, String model, String engine, int power, Long count) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.power = power;
        this.count = count;
    }
}
