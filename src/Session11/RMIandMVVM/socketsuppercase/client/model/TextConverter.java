package Session11.RMIandMVVM.socketsuppercase.client.model;


import Session11.RMIandMVVM.socketsuppercase.shared.transferobjects.LogEntry;
import Session11.RMIandMVVM.socketsuppercase.shared.util.Subject;

import java.util.List;

public interface TextConverter extends Subject {

    String toUppercase(String text);
    List<LogEntry> getLogs();

}


