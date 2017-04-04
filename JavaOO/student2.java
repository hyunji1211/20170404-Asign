package student;

public class student2 {
	
	public static void main(String[] args) {
		Student1 s = new Student1();
		
		s.setsubject("경영학과");
		s.sethakNum(20168888);
		
		System.out.println("학과 :" + s.getsubject());
		System.out.println("학번 :" + s.gethakNum());
	}

}
