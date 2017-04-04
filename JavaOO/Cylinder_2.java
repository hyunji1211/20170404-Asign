public class Cylinder_2 {
	public Circle circle;
	public double height;
	
	public double getVolume() {
		return circle.getArea() * height;
	}
	public Cylinder_2(Circle c, double height){
		this.circle = c;
		this.height = height;
	}
	
	public static void main(String[] args) {
		Cylinder_2 cd = new Cylinder_2(new Circle(2.8),5.6);
		System.out.println(cd.getVolume());
	}
}