package FX;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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
	
	Stage window; 
	Scene scene1,scene2;
	
	
	public static void main(String[] args) {
		launch(args);

	}
	
	//�������FX������ʼ�ĵط���launch��args�����Application��Ķ������ú�
	public void start(Stage primaryStage) throws Exception
	{
	//��javafx�� һ�����ڵ�����Ȧ������stage��	
	//stage��������ݽ�����sence���������˵�������򣬰����ȵ�
		
//		primaryStage.setTitle("Main Window");
//		b = new Button("Click");
//		//b.setText("Click");
//		//b.setOnAction(this);//
//		b.setOnAction(new EventHandler<ActionEvent>()
//		{
//
//			@Override
//			public void handle(ActionEvent event) {
//				// TODO Auto-generated method stub
//				System.out.println("OHHHhhhhhhhhhh");
//			}
//			
//		});
//		
//		//b.setOnAction(e ->System.out.println("This is new feature in JDK 8"););
//		
//		StackPane layout = new StackPane();
//		layout.getChildren().add(b);
//		
//		Scene scene = new Scene(layout,300,250);
//		primaryStage.setScene(scene);
//		primaryStage.show();//display
		
		window = primaryStage;
		
		Label label = new Label("Welcome to the first scene");
		Button b = new Button("go scene 2");
		b.setOnAction(e -> window.setScene(scene2));
		
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label,b);
		scene1 = new Scene(layout1,200,200);
		
		Button b1 = new Button("back scene 1");
		b1.setOnAction(e -> window.setScene(scene1));
		
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(b1);
		scene2 = new Scene(layout2,500,300);
		
		window.setScene(scene1);
		window.setTitle("This is a Title");
		window.show();
		
	}
	
	
	//��һ������������event��������ִ��
	public void handle(ActionEvent event)
	{
		if(event.getSource()==b)//���button b �����
		{
			System.out.println("OOOOoooooooo I LOVE IT!");
		}
	}
	
	public FXTutorial() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
