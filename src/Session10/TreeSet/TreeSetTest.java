package Session10.TreeSet;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Person person1 = new Person("Chris", "Hunt", 27);
        Person person2 = new Person("Gabriela", "Dicusar", 19);
        Person person3 = new Person("Lukasz", "Sramkowski", 22);
        TreeSet<Person> personAgeTreeSet = new TreeSet<>(new AgeComparator());
        TreeSet<Person> personLastNameTreeSet = new TreeSet<>(new LastnameComparator());

        personAgeTreeSet.add(person1);
        personAgeTreeSet.add(person2);
        personAgeTreeSet.add(person3);

        personLastNameTreeSet.add(person1);
        personLastNameTreeSet.add(person2);
        personLastNameTreeSet.add(person3);

        System.out.println(personAgeTreeSet);
        System.out.println(personLastNameTreeSet);
    }
}
