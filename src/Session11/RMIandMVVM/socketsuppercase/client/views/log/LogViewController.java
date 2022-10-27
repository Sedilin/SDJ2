package Session11.RMIandMVVM.socketsuppercase.client.views.log;

import Session11.RMIandMVVM.socketsuppercase.client.core.ViewHandler;
import Session11.RMIandMVVM.socketsuppercase.client.core.ViewModelFactory;
import Session11.RMIandMVVM.socketsuppercase.client.views.ViewController;
import Session11.RMIandMVVM.socketsuppercase.shared.transferobjects.LogEntry;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class LogViewController implements ViewController {

    // I can make these field public. Or make them private, and mark them with @FXML.
    // The result is the same. Private is probably preferable,
    // because if something doesn't _need_ to be public, it shouldn't be

    @FXML
    private TableView<LogEntry> tableView;
    public TableColumn<String, LogEntry> inputColumn;
    public TableColumn<String, LogEntry> outputColumn;

    private LogViewModel vm;
    private ViewHandler vh;

    @Override
    public void init(ViewHandler vh, ViewModelFactory vmf) {
        this.vh = vh;
        vm = vmf.getLogViewModel();
        vm.loadLogs();
        tableView.setItems(vm.getLogs());
        inputColumn.setCellValueFactory(new PropertyValueFactory<>("input"));
        outputColumn.setCellValueFactory(new PropertyValueFactory<>("output"));
    }

    public void onBackButton() {
        vh.openToUppercase();
    }
}
