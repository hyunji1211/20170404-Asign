public class Cylinder {
	public Circle circle;
	public double height;
	
	public double getVolume() {
		return circle.getArea() * height;
	}
	
	public static void main(String[] args) {
		Cylinder cd = new Cylinder();
		cd.circle = new Circle(2.8);
		cd.height = 5.6;
		System.out.println("원통의부피는:"+cd.getVolume()+"입니다.");
	}

}