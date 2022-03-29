package Java8FeaturesExcerses.codedecode.sort_searchobjectswithstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8SortandsearchDemo {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"Salas",500));
        empList.add(new Employee(2, "Semira", 1500));
        empList.add(new Employee(3, "Esain",2000));
        empList.add(new Employee(4, "Solo", 2500));
        empList.add(new Employee(5, "Endeshaw", 3000));


       List<Employee> empSortedList = empList.stream().sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary()))
               //.limit(3)
               .skip(1)
               .collect(Collectors.toList());
       System.out.println("By Salary   "+empSortedList);

       // List<Employee> empSortedListByName = empList.stream().sorted((o1, o2) -> (int)(o1.getName().compareTo(o2.getName()))
                //.limit(3)
                //.skip(1)
                //.collect(Collectors.toList()));
        //System.out.println("By Name   "+empSortedListByName);

    }
}
