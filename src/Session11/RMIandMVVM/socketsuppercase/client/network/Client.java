package Session11.RMIandMVVM.socketsuppercase.client.network;


import Session11.RMIandMVVM.socketsuppercase.shared.transferobjects.LogEntry;
import Session11.RMIandMVVM.socketsuppercase.shared.util.Subject;

import java.util.List;

public interface Client extends Subject {

    String toUppercase(String str);
    List<LogEntry> getLog();

    void startClient();
}
