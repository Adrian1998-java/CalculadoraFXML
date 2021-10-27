package dad.calculadorafxml.controller;

import dad.calculadorafxml.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable{

		Calculadora calculo = new Calculadora();
		
	
	 	@FXML
	    private GridPane view;

	    @FXML
	    private TextField calculoTextfield;

	    @FXML
	    private Button sieteButton;

	    @FXML
	    private Button ochoButton;

	    @FXML
	    private Button nueveButton;

	    @FXML
	    private Button CEButton;

	    @FXML
	    private Button CButton;

	    @FXML
	    private Button cuatroButton;

	    @FXML
	    private Button cincoButton;

	    @FXML
	    private Button seisButton;

	    @FXML
	    private Button tresButton;

	    @FXML
	    private Button dosButton;

	    @FXML
	    private Button unoButton;

	    @FXML
	    private Button ceroButton;

	    @FXML
	    private Button multButton;

	    @FXML
	    private Button comaButton;

	    @FXML
	    private Button restarButton;

	    @FXML
	    private Button sumaButton;

	    @FXML
	    private Button dividirButton;

	    @FXML
	    private Button igualButton;

	
	
	public CalculadoraController() throws IOException
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraFXMLView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		
		calculoTextfield.setText(calculo.getPantalla());
		
	}
	
	public GridPane getView() {
		return view;
	}
	
	//Evetos (LISTENERS)
	

    @FXML
    void onBorrar(ActionEvent event) {
    	calculo.borrar();
    	calculoTextfield.setText(calculo.getPantalla());
    }

    @FXML
    void onBorrarTodo(ActionEvent event) {
    	calculo.borrarTodo();
    	calculoTextfield.setText(calculo.getPantalla());
    }

    @FXML
    void onOperandoClick(ActionEvent e) {
    	if(e.getSource() == sumaButton)
    	{
    		calculo.operar(Calculadora.SUMAR);
    	}
    	if(e.getSource() == restarButton)
    	{
    		calculo.operar(Calculadora.RESTAR);
    	}
    	if(e.getSource() == multButton)
    	{
    		calculo.operar(Calculadora.MULTIPLICAR);
    	}
    	if(e.getSource() == dividirButton)
    	{
    		calculo.operar(Calculadora.DIVIDIR);
    	}
    	if(e.getSource() == igualButton)
    	{
    		calculo.operar(Calculadora.IGUAL);
    	}
    	if(e.getSource() == comaButton)
    	{
    		calculo.insertarComa();
    	}
    	calculoTextfield.setText(calculo.getPantalla());
    }
	
	
    @FXML
    void onClickNumber(ActionEvent e) {
    	
    	if(e.getSource() == ceroButton)
		{
			calculo.insertar('0');
		}
    	if(e.getSource() == unoButton)
		{
			calculo.insertar('1');
		}
    	if(e.getSource() == dosButton)
		{
			calculo.insertar('2');
		}
    	if(e.getSource() == tresButton)
		{
			calculo.insertar('3');
		}
    	if(e.getSource() == cuatroButton)
		{
			calculo.insertar('4');
		}
    	if(e.getSource() == cincoButton)
		{
			calculo.insertar('5');
		}
    	if(e.getSource() == seisButton)
		{
			calculo.insertar('6');
		}
    	if(e.getSource() == sieteButton)
		{
			calculo.insertar('7');
		}
    	if(e.getSource() == ochoButton)
		{
			calculo.insertar('8');
		}
    	if(e.getSource() == nueveButton)
		{
			calculo.insertar('9');
		}
//    	System.out.println("Has pulsado"+ (Button) e.getSource());
    	
    	calculoTextfield.setText(calculo.getPantalla());
    }

}
