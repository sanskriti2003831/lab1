package lab1; 

//This is going to be the driver class.
//First we will create the necessary objects and put them to test.

public class lab1 {
	
	    public static void main (String args[]){
	        Rectangle R1 = new Rectangle(3,4);   //Creating instances of the class Rectangle
	        Rectangle R2 = new Rectangle(4,8);
	        
	        
	        Circle C1 = new Circle(5.9);         //Creating instances of the class Circle
	        Circle C2 = new Circle(9.6);
	        
	       
	        
	        Eclipse E1 = new Eclipse(4,6);     //Creating instances of the class Eclipse
	        Eclipse E2 = new Eclipse(8,7);   
	      
	       
	        
	        
	     // Use the toString() method to display information about each shape
	        System.out.println(R1.toString());
	        System.out.println(R2.toString());
	        System.out.println(C1.toString());
	        System.out.println(C2.toString());
	        System.out.println(E1.toString());
	        System.out.println(E2.toString());
	        
	        
	       
	       //Testing for the rectangle:
	     
	       System.out.println("The area of the rectangle is " + R1.getArea());
	       System.out.println("The area of the rectangle is " + R2.getArea());
	       
	       
	       //Testing for the circle:
	       
	       System.out.println("The area of the circle is: " + C1.getArea());
	       System.out.println("The area of the circle is: " + C2.getArea());
	       
	       
	       //Testing for the eclipse:
	       System.out.println("The area of the eclipse is: " + E1.getArea());
	       System.out.println("The area of the eclipse is: " + E2.getArea());
	       
	       
	       
	       
	   
	    }
}
