package Session8.Factory_Drinks;


import java.util.HashMap;
import java.util.Map;

public abstract class Bar {

    private Map<String, Drink> drinks = new HashMap<>();

    public Drink makeDrink(String name)
    {
        return drinks.get(name);
    }

}
