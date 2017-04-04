package student;

public class Student1 {
	
	private String subject;
	private int hakNum; 

	public void setsubject(String sub) {
		this.subject=sub;
	}
		
	public void sethakNum(int hak) {
		this.hakNum=hak;
	
	}
	public String getsubject() {
		return this.subject;
	}
	public int gethakNum() {
		return this.hakNum;
	}

}