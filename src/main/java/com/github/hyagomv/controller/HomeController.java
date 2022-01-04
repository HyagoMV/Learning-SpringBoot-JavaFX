package com.github.hyagomv.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {
	
	@FXML
	private Button btnEntrar;
	
	public void initialize() {
		System.out.println("Hello Home Controller!");
		
		btnEntrar.setOnAction(event -> {
			System.out.println("Click");
		});
	}
	
}
