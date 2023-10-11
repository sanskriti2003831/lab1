package lab1;

public class Circle extends Shape{
	private double radius; //setting up attributes
	
	//below we setup the getter, setter methods:
	
	public double getRadius() { //getter function
		return radius;
	}
	
	public void setRadius(double radius) {   //setter function
		this.radius = radius;
	}
	
	public int getArea(){
		return (int) (Math.PI * radius * radius);
	}
	
	Circle(double radius){
		super(0); //since circle has 0 sides!
		this.radius = radius;
		
	}
	
	
	public String toString() {
        return "The Circle has [Radius: " + radius +  " Sides: " + getSides() + "]";
    }
	
	
	
	

}
