package Session11.RMIandMVVM.socketsuppercase.server.model;



import Session11.RMIandMVVM.socketsuppercase.shared.transferobjects.LogEntry;
import Session11.RMIandMVVM.socketsuppercase.shared.util.Subject;

import java.util.List;

public interface TextManager extends Subject {

    String toUppercase(String str);
    List<LogEntry> getLog();
}
