package application1;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class adminpagemenu {

	public AnchorPane menu()
	{
		Font f7 = new Font(20);
		Button b8 = new Button();
		//b3.setLayoutX(-5.0);
		b8.setLayoutY(408.0);
		b8.setPrefSize(207, 49);
		b8.setText("Quit");
		Button b7 = new Button();
		//b2.setLayoutX(-5.0);
		b7.setLayoutY(359.0);
		b7.setPrefSize(207, 49);
		b7.setText("Fine");
		Button b6 = new Button();
		//b1.setLayoutX(-5.0);
		b6.setLayoutY(310.0);
		b6.setPrefSize(207, 49);
		b6.setText("Popular Books");
		Button b5 = new Button();
		//b1.setLayoutX(-5.0);
		b5.setLayoutY(261.0);
		b5.setPrefSize(207, 49);
		b5.setText("Borrowed Books");
		Button b4 = new Button();
		//b1.setLayoutX(-5.0);
		b4.setLayoutY(212.0);
		b4.setPrefSize(207, 49);
		b4.setText("Borrower");
		Button b3 = new Button();
		//b1.setLayoutX(-5.0);
		b3.setLayoutY(163.0);
		b3.setPrefSize(207, 49);
		b3.setText("Branch");
		Button b2 = new Button();
		//b1.setLayoutX(-5.0);
		b2.setLayoutY(114.0);
		b2.setPrefSize(207, 49);
		b2.setText("Reader");
		Button b1 = new Button();
		//b1.setLayoutX(-5.0);
		b1.setLayoutY(65.0);
		b1.setPrefSize(207, 49);
		b1.setText("Document");
		Label lb = new Label();
		lb.setFont(f7);
		//lb.setLayoutX(27.0);
		lb.setLayoutY(14.0);
		lb.setPrefSize(207, 49);
		lb.setText("Menu");
		lb.setAlignment(Pos.CENTER);
		Image img = new Image("\\application1\\library_img.jpg");
		ImageView iv = new ImageView(img);
		iv.setFitHeight(646);
		iv.setFitWidth(207);
		iv.setLayoutX(-6.0);
		iv.setLayoutY(-3.0);
		AnchorPane ap = new AnchorPane();
		ap.getChildren().addAll(iv,lb,b1,b2,b3,b4,b5,b6,b7,b8);
		ap.setPrefSize(207, 646);
		return ap;
	}

}
