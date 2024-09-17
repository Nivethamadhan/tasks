package tasks.tasks_6;

public class Circle {


	   
	    private double radius;

	    
	    public Circle() {
	        this.radius = 0; // Default radius
	    }

	    
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate circumference
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    

	    // Main method to test the Circle class
	    public static void main(String[] args) {
	        Circle circle1 = new Circle(); // Create a Circle with default radius (0)
	        Circle circle2 = new Circle(5); // Create a Circle with radius 5

	        System.out.println("Circle with radius 0" +  " has circumference " + circle1.calculateCircumference());
	        System.out.println("Circle with radius 5" + " has circumference " + circle2.calculateCircumference());
	    }
	

	

}
