package com.github.hyagomv;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.github.hyagomv.database.entity.H2UserEntity;
import com.github.hyagomv.repository.H2UserRepository;
import com.github.hyagomv.view.LoadView;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
 
@SpringBootApplication
public class LaunchApp extends Application {

	private ConfigurableApplicationContext springContext;
	private H2UserRepository repository;

	@Override
	public void init() throws Exception {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		springContext = SpringApplication.run(LaunchApp.class);
		repository = springContext.getBean(H2UserRepository.class);
		repository.save(new H2UserEntity());
	}

	@Override
	public void start(Stage stage) throws Exception {
		Image image = new Image(LaunchApp.class.getResourceAsStream("/img/icon.png"));
		stage.getIcons().add(image);
		stage.setTitle("Title");
		stage.setScene(LoadView.loadScene("home"));
		stage.show();
		
		System.out.println(repository.findById(1L));
		
	}
	
	@Override
	public void stop() throws Exception {
		springContext.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
