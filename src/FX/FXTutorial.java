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
	
	//�������FX������ʼ�ĵط���launch��args�����Application��Ķ������ú�
	public void start(Stage primaryStage) throws Exception
	{
	//��javafx�� һ�����ڵ�����Ȧ������stage��	
	//stage��������ݽ�����sence���������˵�������򣬰����ȵ�
		
		primaryStage.setTitle("Main Window");
		b = new Button("Click");
		//b.setText("Click");
		//b.setOnAction(this);//
		b.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("OHHHhhhhhhhhhh");
			}
			
		});
		
		//b.setOnAction(e ->System.out.println("This is new feature in JDK 8"););
		
		StackPane layout = new StackPane();
		layout.getChildren().add(b);
		
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();//display
		
		
		
		
		
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
