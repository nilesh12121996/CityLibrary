package application1;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class loginmenu {

public AnchorPane menu()
{
	Font f7 = new Font(20);
	Button b3 = new Button();
	//b3.setLayoutX(-5.0);
	b3.setLayoutY(163.0);
	b3.setPrefSize(207, 49);
	b3.setText("Quit");
	Button b2 = new Button();
	//b2.setLayoutX(-5.0);
	b2.setLayoutY(114.0);
	b2.setPrefSize(207, 49);
	b2.setText("Administration Login");
	Button b1 = new Button();
	//b1.setLayoutX(-5.0);
	b1.setLayoutY(65.0);
	b1.setPrefSize(207, 49);
	b1.setText("Reader Login");
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
	ap.getChildren().addAll(iv,lb,b1,b2,b3);
	ap.setPrefSize(207, 646);
	return ap;
}
}
