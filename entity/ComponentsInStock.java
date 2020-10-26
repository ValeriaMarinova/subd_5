package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ComponentsInStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer count;
    @OneToMany
    private List<AutoRepair> autoRepair;

    public String toString() {
        return "Components_in_stock {\n" +
                "id =" + id + ",\n" +
                "name=" + name + ",\n" +
                "count=" + count + ",\n" +
                "}" + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
