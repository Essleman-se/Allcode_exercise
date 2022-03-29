import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        Person e1 = new Person("Adam", 12);
        Person e2 = new Person("Steve", 10);
        Person e3 = new Person("Znash", 40);
        Person e4 = new Person("Bere", 20);

        List<Person> people = new ArrayList<>();

        people.add(e1);
        people.add(e2);
        people.add(e3);
        people.add(e4);

        //System.out.println("Before Sort only comparable");
        System.out.println("Before Sort only comparable");
        //System.out.println(people);

        //Collections.sort(people);
        System.out.println("After Sort only");
        System.out.println(people);

        System.out.println("After Sort by name");
        PersonNameComparator personNameComparator = new PersonNameComparator();
        //Collections.sort(people, personNameComparator);
        Comparator comparatorPersonByName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(people, comparatorPersonByName);
        System.out.println(people);



        int retval = e1.compareTo(e2);
        switch(retval) {
            case -1: {
                System.out.println("The " + e2.getName() + " is older!");
                break;
            }
            case 1: {
                System.out.println("The " + e1.getName() + " is older!");
                break;
            }
            default:
                System.out.println("The two persons are of the same age!");
        }
    }
}
