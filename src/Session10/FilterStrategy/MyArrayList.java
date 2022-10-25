package Session10.FilterStrategy;

import java.util.ArrayList;

public class MyArrayList implements  ListADT {

    private Filter filter;

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public ListADT getFiltered()
    {
        MyArrayList temp = new MyArrayList();
        for (Person s : implementation)
        {
            if (filter.filter(s))
            temp.add(s);
        }
        return temp;
    }

    private ArrayList<Person> implementation = new ArrayList();
    @Override
    public void add(Person s) {
        implementation.add(s);
    }

    @Override
    public void add(int idx, Person s) {
        implementation.add(idx,s);
    }

    @Override
    public void set(int idx, Person s) {
        implementation.set(idx,s);
    }

    @Override
    public Person get(int idx) {
        return implementation.get(idx);
    }

    @Override
    public Person remove(int idx) {
        return implementation.remove(idx);
    }

    @Override
    public boolean isEmpty() {
        return implementation.isEmpty();
    }

    @Override
    public int size() {
        return implementation.size();
    }

    public String toString()
    {
        String temp = "";
        for (Person p : implementation)
        {
            temp += p.getFirstname() + " ";
        }
        return temp;
    }
}
