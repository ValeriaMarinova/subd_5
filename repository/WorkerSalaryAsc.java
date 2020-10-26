package repository;

public class WorkerSalaryAsc {
    private String name;
    private String secondName;
    private int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public WorkerSalaryAsc(String name, String secondName, int salary) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
    }
}
