package lab1;

public class Rectangle extends Shape{
	//setting up attributes:
private int width;       
private int height;
   
 public int getWidth(){    ////getter function for the width of the Rectangle
 return width;
 }
 
 public void setWidth(int width){    //setter function for the width of the Rectangle
 this.width = width;
 }
 
 
 public int getHeight(){      /////getter function for the height of the Rectangle
     return height;
 }
 
 public void setHeight(int height){    ///setter function for the height of the Rectangle
 this.height = height;
 }
 
 
  public int getArea(){
 return width * height;
 }
  
  
  public String toString() {
	  return "The rectangle has [Width: " + width + ", Height: " + height + "  Sides: " + getSides() + "]";
  }
  
//Constructor:
 Rectangle (int width, int height){ 
     super(4);
     this.height = height;
     this.width = width;
 }  
}


