package application;
	


import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Line;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Circle c =new Circle(50,235,40);
			c.setFill(Color.DARKORANGE);
			c.setStroke(Color.GREEN);
			c.setStrokeWidth(5);
			
			Line l =new Line(70,280,350,70);
			l.setStroke(Color.BLACK);
			l.setStrokeWidth(15);
			
			Circle sl = new Circle(0,0,60);
	        sl.setFill(Color.YELLOW);
	       
	        sl.setBlendMode(BlendMode.SRC_ATOP);
			
			
			
			Line lv =new Line(200,180,150,290);
			lv.setStroke(Color.BLACK);
			lv.setStrokeWidth(5);
			
            Line ls =new Line(250,290,200,190);
			ls.setStroke(Color.BLACK);
			ls.setStrokeWidth(5);
			
			Rectangle r =new javafx.scene.shape.Rectangle(240,20,70,70);
			r.setFill(Color.GREENYELLOW);
		    r.setStroke(Color.DARKGREEN);
			r.setStrokeWidth(5);
			
			
		
			root.getChildren().add(c);
			root.getChildren().add(l);
			root.getChildren().add(r);
			root.getChildren().add(lv);
			root.getChildren().add(ls);
			root.getChildren().add(sl);
			
			
			Scene scene = new Scene(root,400,400,Color.LIGHTSKYBLUE);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("First Java FX APP");
			
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
