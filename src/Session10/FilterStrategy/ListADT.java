package Session10.FilterStrategy;

public interface ListADT {
    void add(Person s);
    void add(int idx, Person s);
    void set(int idx, Person s);
    public Person get(int idx);
    public Person remove(int idx);
    public boolean isEmpty();
    public int size();
    ListADT getFiltered();
}
