package pq1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

public class Controller {
	
	// model
	
	// view
	
	@FXML
	private GridPane view;
	
	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public GridPane getView() {
		return view;
	}

}
