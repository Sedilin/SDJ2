package Session8.Factory_Drinks;

public class Wine extends Drink{

    public static final String red = "red";
    public static final String white = "white";
    public static final String rose = "rose";
    private String type, name, description;

    public Wine(String name, String type, String description)
    {
        super(name, description);
        this.type = type;
    }

}
