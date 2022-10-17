package dad.maven.buscarreemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {
	
	private Button buscarButton, remplazarButton, remplazarTodoButton, cerrarButton, ayudaButton;
	private RadioButton mayuYminRadio, expresionRadio, buscarAtrasRadio, resaltarRadio;
	private TextField buscarText;
	private TextField remplazarText;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscarText = new TextField();
		remplazarText = new TextField();
		
		buscarButton = new Button("Buscar");
		remplazarButton = new Button("Remplazar");
		remplazarTodoButton = new Button("Remplazar todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		remplazarButton.setMaxWidth(Double.MAX_VALUE);
		remplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		
		mayuYminRadio = new RadioButton("Mayúsculas y minúsculas");
		expresionRadio = new RadioButton("Expresión regular");
		buscarAtrasRadio = new RadioButton("Buscar hacia atrás");
		resaltarRadio = new RadioButton("Resaltar resultados");
		
		GridPane radio = new GridPane();
		radio.addRow(0, mayuYminRadio, buscarAtrasRadio);
		radio.addRow(1, expresionRadio, resaltarRadio);
		radio.setHgap(8);
		
		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
		root.addRow(0, new Label("Buscar: "), buscarText, buscarButton);
		root.addRow(1, new Label("Remplazar con: "), remplazarText, remplazarButton);
		root.addRow(2, new Label(""), radio, remplazarTodoButton);	
		root.addRow(3, new Label(""), new Label(""), cerrarButton);	
		root.addRow(4, new Label(""), new Label(""), ayudaButton);	
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		

		root.getColumnConstraints().setAll(cols);
		
		
		
		cols[0].setHalignment(HPos.RIGHT);
		cols[0].setMinWidth(Control.USE_PREF_SIZE);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[2].setMinWidth(Control.USE_PREF_SIZE);
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(new Scene(root, 440, 240));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
