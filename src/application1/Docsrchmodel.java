package application1;

public class Docsrchmodel 
{
	String docid,title,pubname,address;
	
	public Docsrchmodel(String docid,String title,String pubname,String address) {
		// TODO Auto-generated constructor stub
		this.address=address;
		this.docid=docid;
		this.pubname=pubname;
		this.title=title;
	}
	
	public String getDocid() {
		return docid;
	}
	public String getAddress() {
		return address;
	}
	public String getPubname() {
		return pubname;
	}
	public String getTitle() {
		return title;
	}
	public void setDocid(String docid){
		this.docid=docid;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setPubname(String pubname){
		this.pubname=pubname;
	}
	public void setTitle(String title){
		this.title=title;
	}
}
