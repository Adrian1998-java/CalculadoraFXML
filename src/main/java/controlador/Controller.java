package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import calculadora.calculadora;

public class Controller implements Initializable{

	private calculadora Calculadora = new calculadora();
	
	@FXML
	private AnchorPane view;
	
	@FXML
	private TextField txtResultado;
	
	@FXML
	private Button btn7;

	@FXML
	private Button btn5;

	@FXML
	private Button btn9;

	@FXML
	private Button btn8;

	@FXML
	private Button btn4;

	@FXML
	private Button btn1;

	@FXML
	private Button btn0;

	@FXML
	private Button btn2;

	@FXML
	private Button btn6;

	@FXML
	private Button btn3;

	@FXML
	private Button btnComa;

	@FXML
	private Button btnCE;

	@FXML
	private Button btnMultiplicacion;

	@FXML
	private Button btnResta;

	@FXML
	private Button btnSuma;

	@FXML
	private Button btnC;

	@FXML
	private Button btnDivision;

	@FXML
	private Button btnIgual;
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public Controller() throws IOException {
		FXMLLoader load = new FXMLLoader(getClass().getResource("resources/CalculadoraFXML.fxml"));
		load.setController(this);
		load.load();
	}
	
	public AnchorPane getView() {
		return view;
	}
	
	@FXML
	private void escribeNumero(ActionEvent event) {
		Button boton = (Button) event.getSource();
		char res = boton.getText().toCharArray()[0];
		Calculadora.insertar(res);
		
		txtResultado.setText(Calculadora.getPantalla());
	}
	
	//Determina la Operacion
	@FXML
	private void determinaOperacion(ActionEvent event){
		Button boton = (Button) event.getSource();
		String operacion = boton.getText();
		
		switch(operacion) {
			case "+":{
				Calculadora.operar(Calculadora.SUMAR);
				break;
			}
			case "-":{
				Calculadora.operar(Calculadora.RESTAR);
				break;
			}
			case "*":{
				Calculadora.operar(Calculadora.MULTIPLICAR);
				break;
			}
			case "/":{
				Calculadora.operar(Calculadora.DIVIDIR);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: "+operacion);
			
		}
	}
	
	//Igual
	@FXML
	private void realizarTotal(ActionEvent event) {
		Calculadora.operar(Calculadora.IGUAL);
		txtResultado.setText(Calculadora.getPantalla());
	}
	//Inserta coma
	@FXML
	private void insertaComa(ActionEvent event) {
		Calculadora.insertarComa();
		txtResultado.setText(Calculadora.getPantalla());
	}
	
	//Borrar ultimo valor puesto
	@FXML
	private void borrarInput(ActionEvent event) {
		Calculadora.borrar();
		txtResultado.setText(Calculadora.getPantalla());
	}
	//Borrar todo
	@FXML
	private void borrarTodo(ActionEvent event) {
		Calculadora.borrarTodo();
		txtResultado.setText(Calculadora.getPantalla());
	}

}
