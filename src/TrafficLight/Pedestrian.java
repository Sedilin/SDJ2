package TrafficLight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Pedestrian implements PropertyChangeListener {
    private final String name;

    public Pedestrian(String name, PropertyChangeSubject subject)
    {
        this.name= name;
        subject.addPropertyChangeListener(this);
    }

    private void lightChanged(PropertyChangeEvent evt)
    {
        if ("GREEN".equals(evt.getNewValue()))
        {
            System.out.println("Pedestrian " + name + " waits");
        }
        else if ("YELLOW".equals(evt.getNewValue()))
        {
            if ("RED".equals(evt.getOldValue()))
            {
                System.out.println("Pedestrian " + name + " runs faster across the road");
            }
            else
            {
                System.out.println("Pedestrian " + name + " prepares to cross the road");
            }
        }
        else if ("RED".equals(evt.getNewValue()))
        {
            System.out.println("Pedestrian " + name + " crosses the road");
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        lightChanged(evt);
    }
}
