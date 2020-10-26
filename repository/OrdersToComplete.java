package repository;

import java.util.Date;

public class OrdersToComplete {
    private int id;
    private String target;
    private Date dateToComplete;
    private String name;
    private String secondName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Date getDateToComplete() {
        return dateToComplete;
    }

    public void setDateToComplete(Date dateToComplete) {
        this.dateToComplete = dateToComplete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public OrdersToComplete(int id, String target, Date dateToComplete, String name, String secondName) {
        this.id = id;
        this.target = target;
        this.dateToComplete = dateToComplete;
        this.name = name;
        this.secondName = secondName;
    }
}
