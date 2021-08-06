package application1;


import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Adminmain  {
	public void admain(Stage st) {
		try {
	Stage primaryStage=new Stage();
	adminpagemenu apm=new adminpagemenu();
	branchinfo bi=new branchinfo();
	freqbor fb=new freqbor();
	mostbor mb=new mostbor();
	newdoc nd=new newdoc();
	newread nr=new newread();
	popbook pb=new popbook();
	searchdoc sd=new searchdoc();
	AnchorPane ap=apm.menu();
	ap.getChildren().add(sd.searchpane());
	Node nd0=ap.getChildren().get(2);
	nd0.addEventHandler(MouseEvent.MOUSE_PRESSED,
			(event) ->  {
			// TODO Auto-generated method stub
			ap.getChildren().remove(10);
			ap.getChildren().add(sd.searchpane());
			});
	//root.getItems().addAll(ap,res.search());
	//ap.getChildren().add(res.search());
	Node nd1=ap.getChildren().get(3);
	nd1.addEventHandler(MouseEvent.MOUSE_PRESSED,
			(event) ->  {
			// TODO Auto-generated method stub
			ap.getChildren().remove(10);
			ap.getChildren().add(nr.newreadpane());
			});
	Node nd2=ap.getChildren().get(4);
	nd2.addEventHandler(MouseEvent.MOUSE_PRESSED,
			(event) ->  {
			// TODO Auto-generated method stub
			ap.getChildren().remove(10);
			ap.getChildren().add(bi.branchinfopane());
			});
	Node nd3=ap.getChildren().get(5);
	nd3.addEventHandler(MouseEvent.MOUSE_PRESSED,
			(event) ->  {
			// TODO Auto-generated method stub
			ap.getChildren().remove(10);
			ap.getChildren().add(mb.mostborpane());
			});
	Node nd4=ap.getChildren().get(6);
	nd4.addEventHandler(MouseEvent.MOUSE_PRESSED,
			(event) ->  {
			// TODO Auto-generated method stub
			ap.getChildren().remove(10);
			ap.getChildren().add(fb.freborpane());
			});
	Node nd5=ap.getChildren().get(7);
	nd5.addEventHandler(MouseEvent.MOUSE_PRESSED,
			(event) ->  {
			// TODO Auto-generated method stub
			ap.getChildren().remove(10);
			ap.getChildren().add(pb.popbookpane());
			});
	/*Node nd6=ap.getChildren().get(8);
	nd6.addEventHandler(MouseEvent.MOUSE_PRESSED,
			(event) ->  {
			// TODO Auto-generated method stub
			ap.getChildren().remove(9);
			ap.getChildren().add();
			});*/
	Node nd7=ap.getChildren().get(9);
	nd7.addEventHandler(MouseEvent.MOUSE_PRESSED,
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
