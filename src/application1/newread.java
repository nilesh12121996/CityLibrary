package application1;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;


public class newread{
	public AnchorPane newreadpane() {
		try {
			Font f4 = new Font(19);
			Button b5 = new Button();
			b5.setLayoutX(87.0);
			b5.setLayoutY(371.0);
			b5.setPrefSize(207, 49);
			b5.setText("Submit");
			ChoiceBox<newread> cb = new ChoiceBox<newread>();
			cb.setLayoutX(178);
			cb.setLayoutY(115);
			cb.setPrefWidth(150);
			TextArea txt1 = new TextArea();
			txt1.setLayoutX(262);
			txt1.setLayoutY(229);
			txt1.setPrefSize(200,95);
			TextField txt = new TextField();
			txt.setFont(f4);
			txt.setLayoutX(262.0);
			txt.setLayoutY(171.0);
			Font f3 = new Font(19);
			Font f2 = new Font(33);
			Label lb4 = new Label();
			lb4.setFont(f3);
			lb4.setLayoutX(89.0);
			lb4.setLayoutY(229.0);
			lb4.setText("Address");
			Label lb3 = new Label();
			lb3.setFont(f3);
			lb3.setLayoutX(89.0);
			lb3.setLayoutY(172.0);
			lb3.setText("Reader Name");
			Label lb2 = new Label();
			lb2.setFont(f3);
			lb2.setLayoutX(89.0);
			lb2.setLayoutY(116.0);
			lb2.setText("Type");
			Label lb1 = new Label();
			lb1.setFont(f2);
			lb1.setLayoutX(481.0);
			lb1.setLayoutY(22.0);
			lb1.setText("Administration");
			SplitPane sp = new SplitPane();
			sp.setLayoutX(-7.0);
			sp.setPrefSize(1033, 646);
			Font f7 = new Font(20);
			AnchorPane ap1 = new AnchorPane();
			ap1.getChildren().addAll(sp,lb1,lb2,lb3,lb4,txt1,cb,b5,txt);
			ap1.minHeight(0);
			ap1.minWidth(0);
			ap1.setLayoutX(204.0);
			ap1.setLayoutY(-3.0);
			ap1.setPrefSize(825, 646);
			return ap1;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
