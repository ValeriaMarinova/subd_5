package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Worker {

    public Worker(Integer id, String name, String secondName, int work_experience, String position, int salary, List<AutoRepair> autoRepair) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.work_experience = work_experience;
        this.position = position;
        this.salary = salary;
        this.autoRepair = autoRepair;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Integer id;
    private final String name;
    private final String secondName;
    private final Integer work_experience;
    private final String position;
    private final Integer salary;
    @OneToMany
    private List<Route> route;
    @OneToMany
    private final List<AutoRepair> autoRepair;


    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString() {
        return "Worker {\n" +
                "id =" + id + ",\n" +
                "name=" + name + ",\n" +
                "second_name=" + secondName + ",\n" +
                "work_experience=" + work_experience + ",\n" +
                "position=" + position + ",\n" +
                "salary=" + salary + ",\n" +
                "}" + "\n";
    }
}
