package com.github.hyagomv.view;

import java.io.IOException;
import java.util.ResourceBundle;

import com.github.hyagomv.LaunchApp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoadView {

	public static Scene loadScene(String view) throws IOException {
		Parent root = FXMLLoader.load(LaunchApp.class.getResource("/view/" + view + "/scene.fxml"),
				ResourceBundle.getBundle("view." + view + ".scene")); /* .properties */
		Scene scene = new Scene(root);
		scene.getStylesheets().add(LaunchApp.class.getResource("/view/" + view + "/scene.css").toExternalForm());
		
		return scene;
	}
 
}
