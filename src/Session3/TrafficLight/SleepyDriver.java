package Session3.TrafficLight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SleepyDriver implements PropertyChangeListener {
    private final int id;

    public SleepyDriver(int id, PropertyChangeSubject subject)
    {
        this.id= id;
        subject.addPropertyChangeListener(this);
    }

    private void lightChanged(PropertyChangeEvent evt)
    {
        if ("GREEN".equals(evt.getNewValue()))
        {
            System.out.println("Sleepy driver " + id + " starts the engine and drives");
        }
        else if ("YELLOW".equals(evt.getNewValue()))
        {
            if ("RED".equals(evt.getOldValue()))
            {
                System.out.println("Sleepy driver " + id + " does nothing");
            }
            else
            {
                System.out.println("Sleepy driver " + id + " slows down");
            }
        }
        else if ("RED".equals(evt.getNewValue()))
        {
            System.out.println("Sleepy driver " + id + " stops");
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        lightChanged(evt);
    }
}
