package clone;

public class Main {
    public static void main(String[] args) {

    }
}


class Employee implements Cloneable {
    private long salary = 0;
    private String name = "";

    public Employee(String name, long salary) {
        this.salary = salary;
        this.name = name;
    }

    public void raiseSalary(int increasement) {
        this.salary += increasement;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
