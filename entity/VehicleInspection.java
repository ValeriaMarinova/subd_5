package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class VehicleInspection {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private final Date date_inspection;
    @ManyToOne
    private Cars cars;

    public VehicleInspection(Date date_inspection) {
        this.date_inspection = date_inspection;
    }

    public String toString() {
        return "VehicleInspection {\n" +
                "id =" + id + ",\n" +
                "date_inspection=" + date_inspection + ",\n" +
                "}" + "\n";
    }
}
