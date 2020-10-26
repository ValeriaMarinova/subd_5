package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String target;

    private Date dateToComplete;
    @ManyToOne
    private final Clients clients;
    @ManyToOne
    private Worker worker;

    public Route(String target, Clients clients) {
        this.target = target;
        this.clients = clients;
    }

    public String toString() {
        return "Route {\n" +
                "id =" + id + ",\n" +
                "target=" + target + ",\n" +
                "dateToComplete=" + dateToComplete + ",\n" +
                "}" + "\n";
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setDateToComplete(Date dateToComplete) {
        this.dateToComplete = dateToComplete;
    }
}
