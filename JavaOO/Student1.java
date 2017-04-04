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


public static void main(String[] args) {
	Student1 s = new Student1();
	
	s.setsubject("경영학과");
	s.sethakNum(20168888);
	
	System.out.println("학과 :" + s.getsubject());
	System.out.println("학번 :" + s.gethakNum());
}

}
