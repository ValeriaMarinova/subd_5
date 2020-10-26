package entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class AutoRepair {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Integer id;

    private String repair_type;

    private Date date_repair;
    @ManyToOne
    private Worker worker;
    @ManyToOne
    private final ComponentsInStock componentsInStock;
    @ManyToOne
    private final Cars cars;

    public AutoRepair(Integer id, ComponentsInStock componentsInStock, Cars cars) {
        this.id = id;
        this.componentsInStock = componentsInStock;
        this.cars = cars;
    }

    public String toString() {
        return "Auto_repair {\n" +
                "id =" + id + ",\n" +
                "repair_type=" + repair_type + ",\n" +
                "date_repair=" + date_repair + ",\n" +
                "}" + "\n";
    }

    public void setRepair_type(String repair_type) {
        this.repair_type = repair_type;
    }

    public void setDate_repair(Date date_repair) {
        this.date_repair = date_repair;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
}
