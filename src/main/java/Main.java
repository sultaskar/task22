import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Person> persons = new TreeSet<>(new PersonSuperComparator());

        persons.add(new Person("Владимир",17));
        persons.add(new Person("Александр",18));
        persons.add(new Person("Вениамин",18));
        persons.add(new Person("Александр",19));
        for(Person ps: persons) {
            System.out.println(ps.toString());
        }



    }
}
