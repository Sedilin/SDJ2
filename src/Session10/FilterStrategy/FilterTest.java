package Session10.FilterStrategy;

public class FilterTest {
    public static void main(String[] args) {
        Person person1 = new Person("Chris", "Hunt", 27);
        Person person2 = new Person("Gabriela", "Dicusar", 19);
        Person person3 = new Person("Lukasz", "Sramkowski", 22);

        MyArrayList arrayList = new MyArrayList();

        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);

        Filter ageFilter = new AgeFilter(30);
        Filter nameFilter = new FirstnameFilter("Chris");

        arrayList.setFilter(ageFilter);
        System.out.println(arrayList.getFiltered());
    }
}
