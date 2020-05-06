package Java8Features;

class Room {
	
	double length;
	double breadth;
	
	public Room(double x, double y) {
		length=x;
		breadth=y;
	}
	
	double area() {
		return length*breadth;
	}
}

class BedRoom extends Room{
	
	double height;
	
	BedRoom(double x, double y,double z){
		super(x,y); // pass values to superclass
		height=z;
	}
	
	
	
	double volume() {
		return length*breadth*height;
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		BedRoom BR = new BedRoom(12,14,20);
		double bedroomArea = BR.area();
		double bedroomVolume=BR.volume();
		
		
		System.out.println( "Area of BR: " + bedroomArea  + "BR Volume:" + bedroomVolume);	

	}

}
