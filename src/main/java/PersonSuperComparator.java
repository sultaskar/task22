import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    public int compare(Person o1, Person o2) {

        String str1 = o1.getName();
        String str2 = o2.getName();

        int result = str1.compareTo(str2);
        if (result != 0) {
            return result;
        }

        int age1 = o1.getAge();
        int age2 = o2.getAge();

        if (age1>age2) {
            return 1;
        }
            else if (age1<age2) {
                return -1;
        }
            else {
                return 0;
        }


    }

}
