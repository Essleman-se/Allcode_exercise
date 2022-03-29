package Java8FeaturesExcerses.codedecode.sort_searchobjectswithstream;

import java.util.Comparator;

public class Employee implements  Comparable<Employee>{

    private long id;
    private double salary;
    private String name;

    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {

        return (int) (this.id - o.id);
    }

    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
