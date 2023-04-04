package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtCorretti;

    @FXML
    private TextArea txtErrati;

    @FXML
    private TextField txtParola;

    @FXML
    void doAnagrammi(ActionEvent event) {
    	this.txtCorretti.clear();
    	this.txtErrati.clear();
    	List<String> anagrammi = this.model.faiAnagramma(this.txtParola.getText());
    	for(String s: anagrammi) {
    		if(this.model.esisteParola(s))
    			this.txtCorretti.appendText(s+"\n");
    		else
    			this.txtErrati.appendText(s+"\n");
    	}

    }

    @FXML
    void doReset(ActionEvent event) {
    	this.txtCorretti.clear();
    	this.txtErrati.clear();
    	this.txtParola.clear();
    }

    public void setModel(Model model) {
		this.model = model;
	}

	@FXML
    void initialize() {
        assert txtCorretti != null : "fx:id=\"txtCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtErrati != null : "fx:id=\"txtErrati\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
