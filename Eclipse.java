package lab1;

//Here the Eclipse class is extending the rectangle class, here we will use the inherited attributes from 
// Rectangle class.

public class Eclipse extends Rectangle{
	
Eclipse (int width, int height){
	super(width, height); 
	//super only works inside a constructor, it is calling the parent class
}

	public int getArea() {
		return (int) 3.142 * getWidth() * getHeight();
		//type casting so the end result is an integer value
	}
	
	
	public String toString() {
        return "The Ellipse has [Width: " + getWidth() + " Height: " + getHeight() + " Sides: " + getSides() + "]";
    }
	


}
