package application1;



import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.omg.CORBA.PRIVATE_MEMBER;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.Window;

public class result1 {
	private final TableView<Docsrchmodel> tb = new TableView<Docsrchmodel>();
	Reader_Main rdm=new Reader_Main();
	public AnchorPane read_res(ResultSet res) {
		try
{	
			
			ResultSetMetaData rsmd=res.getMetaData();
			ObservableList<Docsrchmodel> oblist=FXCollections.observableArrayList();
			Font f6 = new Font(18);
			Font f5 = new Font(18);
			Font f4 = new Font(18);
			tb.setEditable(true);
			tb.setLayoutX(34.0);
			tb.setLayoutY(128.0);
			tb.setPrefHeight(358.0);
			tb.setPrefWidth(500.0);
			TableColumn<Docsrchmodel, String> colid=new TableColumn<Docsrchmodel, String>("Docid");
			colid.setPrefWidth((tb.getPrefWidth()*15)/100);
			TableColumn<Docsrchmodel, String> coltitle=new TableColumn<Docsrchmodel, String>("Title");
			coltitle.setPrefWidth((tb.getPrefWidth()*15)/100);
			TableColumn<Docsrchmodel, String> colpubname=new TableColumn<Docsrchmodel, String>("Publisher Name");
			colpubname.setPrefWidth((tb.getPrefWidth()*30)/100);
			TableColumn<Docsrchmodel, String> coladd=new TableColumn<Docsrchmodel, String>("Address");
			coladd.setPrefWidth((tb.getPrefWidth()*40)/100);
			while (res.next()) {
				oblist.add(new Docsrchmodel(res.getString("docid"),res.getString("title"), res.getString("pubname"), res.getString("address")));
			}
			tb.getColumns().addAll(colid,coltitle,colpubname,coladd);
			colid.setCellValueFactory(new PropertyValueFactory<Docsrchmodel, String>("docid"));
			coltitle.setCellValueFactory(new PropertyValueFactory<Docsrchmodel, String>("title"));
			colpubname.setCellValueFactory(new PropertyValueFactory<Docsrchmodel, String>("pubname"));
			coladd.setCellValueFactory(new PropertyValueFactory<Docsrchmodel, String>("address"));
			tb.setItems(oblist);
			Button b8 = new Button();
			b8.setFont(f6);
			b8.setLayoutX(180.0);
			b8.setLayoutY(522.0);
			b8.setText("New Search");
			b8.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
						Stage st=(Stage) b8.getScene().getWindow();
						st.close();
						rdm.readermain(null);
					});
			Button b7 = new Button();
			b7.setFont(f5);
			b7.setLayoutX(60.0);
			b7.setLayoutY(522.0);
			b7.setText("Reserve");
			b8.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
						TableViewSelectionModel<Docsrchmodel> tcsm=tb.getSelectionModel();
						ObservableList<Docsrchmodel> obrelist=tcsm.getSelectedItems();
						if(obrelist.size()!=0)
						{
							
						}
					});
			Font f3 = new Font(21);
			Font f2 = new Font(33);
			Label lb2 = new Label();
			lb2.setFont(f3);
			lb2.setLayoutX(34.0);
			lb2.setLayoutY(90.0);
			lb2.setText("Results of");
			Label lb1 = new Label();
			lb1.setFont(f2);
			lb1.setLayoutX(552.0);
			lb1.setLayoutY(24.0);
			lb1.setText("Reader");
			SplitPane sp = new SplitPane();
			//sp.setLayoutX(-7.0);
			sp.setPrefSize(825, 646);
			AnchorPane ap1 = new AnchorPane();
			ap1.getChildren().addAll(sp,lb1, lb2,b7,b8,tb);
			ap1.minHeight(0);
			ap1.minWidth(0);
			ap1.setLayoutX(204.0);
			ap1.setLayoutY(-3.0);
			ap1.setPrefSize(825, 646);
			return ap1;
}
	catch(Exception e) {
		e.printStackTrace();
		return null;
	}
}

public void returnpage1() {
	//launch(args);
}
}


	

