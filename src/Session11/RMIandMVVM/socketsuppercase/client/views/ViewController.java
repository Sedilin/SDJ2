package Session11.RMIandMVVM.socketsuppercase.client.views;


import Session11.RMIandMVVM.socketsuppercase.client.core.ViewHandler;
import Session11.RMIandMVVM.socketsuppercase.client.core.ViewModelFactory;

public interface ViewController {

    void init(ViewHandler vh, ViewModelFactory vmf);

}
