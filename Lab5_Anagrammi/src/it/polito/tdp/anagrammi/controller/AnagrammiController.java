package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import it.polito.tdp.anagrammi.ricorsione.CercaAnagramma;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	
	CercaAnagramma cercaAnagramma;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtParola;

    @FXML
    private Button btnCalcola;

    @FXML
    private TextArea txtCorretti;

    @FXML
    private TextArea txtErrati;

    @FXML
    private Button btnReset;

    @FXML
    void doCalcola(ActionEvent event) {
    	
    	String s = txtParola.getText();
    	s = s.trim();
    	if(s.matches("[a-zA-Z]*")) {
    		
    	}
    	else {
    		this.txtCorretti.setText("Inserire parola valida");
    	}
    	
    	for(String stemp: cercaAnagramma.ritornaCorrette(s)) {
    		txtCorretti.appendText(stemp+"\n");
    	}
    	
    	for(String stemp: cercaAnagramma.ritornaSbagliate(s)) {
    		txtErrati.appendText(stemp+"\n");
    	}

    }

    @FXML
    void doReset(ActionEvent event) {
    	txtErrati.clear();
    	txtCorretti.clear();
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtCorretti != null : "fx:id=\"txtCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtErrati != null : "fx:id=\"txtErrati\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
    
    public void setCercaAnagramma(CercaAnagramma cercaAnagramma) {
    	this.cercaAnagramma=cercaAnagramma;
    }
}