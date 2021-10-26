package dad.calculadorafxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import dad.calculadorafxml.controller.*;

public class App extends Application{

	CalculadoraController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new CalculadoraController();
		
		Scene scene = new Scene(controller.getView(), 400, 320);
		
		primaryStage.setTitle("Calculadora FXML");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}

	

}
