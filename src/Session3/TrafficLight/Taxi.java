package Session3.TrafficLight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Taxi implements PropertyChangeListener {
    private final int id;

    public Taxi(int id, PropertyChangeSubject subject)
    {
        this.id= id;
        subject.addPropertyChangeListener(this);
    }

    private void lightChanged(PropertyChangeEvent evt)
    {
        if ("GREEN".equals(evt.getNewValue()))
        {
            System.out.println("Taxi " + id + " drives");
        }
        else if ("YELLOW".equals(evt.getNewValue()))
        {
            System.out.println("Taxi " + id + " ignores the light and drives anyway");
        }
        else if ("RED".equals(evt.getNewValue()))
        {
            System.out.println("Taxi " + id + " stops");
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        lightChanged(evt);
    }
}
