package application1;

public class selecteddocmodel {

	String docid,libid,copyno,address;
		
		public selecteddocmodel(String docid,String libid,String copyno,String address) {
			// TODO Auto-generated constructor stub
			this.address=address;
			this.docid=docid;
			this.copyno=copyno;
			this.libid=libid;
		}
		
		public String getDocid() {
			return docid;
		}
		public String getCopyno() {
			return copyno;
		}
		public String getLibid() {
			return libid;
		}
		public void setDocid(String docid){
			this.docid=docid;
		}
		public void setCopyno(String copyno){
			this.copyno=copyno;
		}
		public void setLibid(String libid){
			this.libid=libid;
		}
	}

