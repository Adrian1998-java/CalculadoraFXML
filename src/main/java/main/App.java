package main;

import controlador.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	private Controller controlador;
	
	@Override
	
	public void start(Stage primaryStage) throws Exception{
		controlador = new Controller();
		
		Scene scene = new Scene(controlador.getView(), 514, 428);
		
		primaryStage.setTitle("Calculadora FXML");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
