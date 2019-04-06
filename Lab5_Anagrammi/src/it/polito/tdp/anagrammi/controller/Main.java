package it.polito.tdp.anagrammi.controller;
	
import it.polito.tdp.anagrammi.model.*;
import it.polito.tdp.anagrammi.ricorsione.CercaAnagramma;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Anagrammi.fxml")) ;
			BorderPane root = (BorderPane)loader.load();
			AnagrammiController controller = loader.getController();
			CercaAnagramma cercaAnagramma = new CercaAnagramma();
			controller.setCercaAnagramma(cercaAnagramma);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
