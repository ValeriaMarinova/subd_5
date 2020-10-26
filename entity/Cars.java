package entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Integer id;
    private String brand;
    private String model;
    private Date production_date;
    private String license_plate;
    private String engine;
    private Integer power;
    private Integer volume_truck;
    private Integer weight_min;
    private Integer weight_max;
    private Integer fuel_cons_min;
    private Integer fuel_cons_max;
    @OneToMany
    private final List<AutoRepair> autoRepair;
    @OneToMany
    private List<VehicleInspection> vehicleInspection;

    public Cars(Integer id, String brand, List<AutoRepair> autoRepair) {
        this.id = id;
        this.brand = brand;
        this.autoRepair = autoRepair;
    }

    public String toString() {
        return "Cars {\n" +
                "id =" + id + ",\n" +
                "brand=" + brand + ",\n" +
                "model=" + model + ",\n" +
                "production_date=" + production_date + ",\n" +
                "license_plate=" + license_plate + ",\n" +
                "engine=" + engine + ",\n" +
                "power=" + power + ",\n" +
                "volume_truck=" + volume_truck + ",\n" +
                "weight_min=" + weight_min + ",\n" +
                "weight_max=" + weight_max + ",\n" +
                "fuel_cons_min=" + fuel_cons_min + ",\n" +
                "fuel_cons_max=" + fuel_cons_max + ",\n" +
                "}" + "\n";
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public void setProduction_date(Date production_date) {
        this.production_date = production_date;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setVolume_truck(Integer volume_truck) {
        this.volume_truck = volume_truck;
    }

    public void setWeight_min(Integer weight_min) {
        this.weight_min = weight_min;
    }

    public void setWeight_max(Integer weight_max) {
        this.weight_max = weight_max;
    }

    public void setFuel_cons_min(Integer fuel_cons_min) {
        this.fuel_cons_min = fuel_cons_min;
    }

    public void setFuel_cons_max(Integer fuel_cons_max) {
        this.fuel_cons_max = fuel_cons_max;
    }
}
