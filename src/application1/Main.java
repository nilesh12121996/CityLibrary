package application1;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			loginmenu rm= new loginmenu();
			readerlogin res=new readerlogin();
			AnchorPane ap=rm.menu();
			ap.getChildren().add(res.reader_login(primaryStage));
			Node nd0=ap.getChildren().get(2);
			nd0.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
					// TODO Auto-generated method stub
					ap.getChildren().remove(5);
					ap.getChildren().add(res.reader_login(primaryStage));
					});
			//ap.getChildren().add(res.search());
			Node nd=ap.getChildren().get(3);
			nd.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
					// TODO Auto-generated method stub
					ap.getChildren().remove(5);
					adminlogin rp1=new adminlogin();
					ap.getChildren().add(rp1.admin_login(primaryStage));
					});
			Node nd2=ap.getChildren().get(4);
			nd2.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
					// TODO Auto-generated method stub
					primaryStage.close();
					});
			SplitPane root = new SplitPane(ap);
			root.setPrefSize(1026,646);
			Scene sc = new Scene(root);
			primaryStage.setScene(sc);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
