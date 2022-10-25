package Session10.FilterStrategy;

public class FirstnameFilter implements Filter{

    private String name;

    public FirstnameFilter(String name)
    {
        this.name = name;
    }

    @Override
    public boolean filter(Person p) {
        if (p.getFirstname().equalsIgnoreCase(name))
        {
            return true;
        }
        return false;
    }
}
