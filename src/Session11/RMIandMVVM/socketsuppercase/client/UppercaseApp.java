package Session11.RMIandMVVM.socketsuppercase.client;

import Session11.RMIandMVVM.socketsuppercase.client.core.ClientFactory;
import Session11.RMIandMVVM.socketsuppercase.client.core.ModelFactory;
import Session11.RMIandMVVM.socketsuppercase.client.core.ViewHandler;
import Session11.RMIandMVVM.socketsuppercase.client.core.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class UppercaseApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ClientFactory cf = new ClientFactory();
        ModelFactory mf = new ModelFactory(cf);
        ViewModelFactory vmf = new ViewModelFactory(mf);
        ViewHandler vh = new ViewHandler(vmf);
        vh.start();
    }
}
