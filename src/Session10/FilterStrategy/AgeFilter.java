package Session10.FilterStrategy;


public class AgeFilter implements Filter{

    private int maxAge;

    public AgeFilter(int maxAge){
        this.maxAge = maxAge;
    }

    @Override
    public boolean filter(Person p) {
        if (p.getAge() < maxAge)
        {
            return true;
        }
        return false;
    }

}
