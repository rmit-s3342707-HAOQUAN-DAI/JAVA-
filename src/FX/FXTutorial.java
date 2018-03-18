package FX;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/*
 * javaFX tutorial
 * 18/03/2018
 * @HAOQUAN DAI
 * 
 */




public class FXTutorial extends Application implements EventHandler<ActionEvent>{

	Button b;

	public static void main(String[] args) {
		launch(args);

	}
	
	//这里才是FX主程序开始的地方，launch（args）会把Application里的东西设置好
	public void start(Stage primaryStage) throws Exception
	{
	//在javafx里 一个窗口的最外圈叫做“stage”	
	//stage里面的内容叫做“sence”，包括菜单，输入框，按键等等
		
		primaryStage.setTitle("Main Window");
		b = new Button("Click");
		//b.setText("Click");
		b.setOnAction(this);//
		
		StackPane layout = new StackPane();
		layout.getChildren().add(b);
		
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();//display
		
		
		
		
		
	}
	
	public void handle(ActionEvent event)
	{
		if(event.getSource()==b)
		{
			System.out.println("OOOOoooooooo I LOVE IT!");
		}
	}
	
	public FXTutorial() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
