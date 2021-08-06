package application1;

import java.util.Properties;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Reader_Main{
	
	public void readermain(Stage st) {
		try {
			Stage primaryStage=new Stage();
			reader_menu rm= new reader_menu();
			reader_search res=new reader_search();
			AnchorPane ap=rm.menu();
			ap.getChildren().add(res.search());
			Node nd0=ap.getChildren().get(2);
			nd0.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
					// TODO Auto-generated method stub
					ap.getChildren().remove(6);
					ap.getChildren().add(res.search());
					});
			//root.getItems().addAll(ap,res.search());
			//ap.getChildren().add(res.search());
			Node nd=ap.getChildren().get(3);
			nd.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
					// TODO Auto-generated method stub
					ap.getChildren().remove(6);
					returnpage rp1=new returnpage();
					ap.getChildren().add(rp1.re_start());
					});
			Node nd1=ap.getChildren().get(4);
			nd1.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
					// TODO Auto-generated method stub
					ap.getChildren().remove(6);
					reserve rp1=new reserve();
					ap.getChildren().add(rp1.re_start());
					});
			Node nd2=ap.getChildren().get(5);
			nd2.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
					// TODO Auto-generated method stub
					primaryStage.close();
					st.show();
					});
			/*Pane pn = new Pane();
			pn.getChildren().addAll(iv,ap);
			pn.setPrefSize(200,200);*/
			SplitPane root = new SplitPane(ap);
			root.setPrefSize(1026,646);
			Scene sc = new Scene(root);
			primaryStage.setScene(sc);
			primaryStage.show();
} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
