
public class TestPoints {

	public static void main(String[] args) {
		// Create a couple of points:
		Point p1 = new Point(2, 4);
		Point p2 = new Point(-2, 4);
		
		// Print out the point:
		System.out.println(p1); // Task: make it print out in a user-friendly way
		
		
		System.out.println("Distance from zero for p1 = " + 
				p1.distanceFromZero());
		System.out.println("Distance from zero for p2 = " + 
				p2.distanceFromZero());
		
		
		// How can we get p1's x and y?
		System.out.println("x = " + p1.getX());
		
		// Can we change x or y in points?
		
		
		// Test a method for a distance between two points:
		System.out.println("Distance = " + p1.distance(p2));
		System.out.println("Distance = " + p1.distance(p1));
		
		// Create color points
		ColorPoint cp1 = new ColorPoint(2, 4, colors.MAROON);
		ColorPoint cp2 = new ColorPoint(-2, 4, colors.GREEN);
		
		// Task: make it print out in a user-friendly way
		System.out.println(cp1);

		// Can I find their distance from zero? 
		System.out.println(cp1.distanceFromZero());

		// Can I find distance between two color points? A point and a color point?
		System.out.println(cp1.distance(cp2));
		System.out.println(p1.distance(cp2));
		System.out.println(cp1.distance(p2));
		
		System.out.println("counter = " + cp2.getCounter());
		

		
		/****Lab Task 1: answer the following questions ********/
		
		// Q1: Which of the following is a valid statement? Why?
		 Point p3 = new ColorPoint(3, 3, colors.MAROON);
		 Point p5 = new Point(3, 3);
		 
		// ColorPoint cp3 = new Point(3,3);
		/*The ColorPoint class is inherited from the Point class. Therefore, this does not work when attempting to create a Point object within a Colorpoint object. */
		// Q2: Uncomment a valid statement above. How can you call 
		// getColor() on the resulting variable? 
		// Cast the p3 object, which carries a ColorPoint constructor call, with the class ColorPoint.
		
		// Clearly explain what is required from the type safety standpoint
		// to call this method. 

		/*
		 * In order to safely typecast a object, ensure that said object's constructor call carries the same class as the typecast itself (e.g., the typecast ColorPoint and the constructor call to ColorPoint share the same class).
		 */

		// Hint: use typecasting. 
		
		// Once you get the method to work, print out the result of getColor()
		System.out.println(((ColorPoint) p3).getColor());
		// Q3: see ColorPoint class. 
		
		// Q4: create an array list of points. Then add 10 points to it,
		// randomly choosing between regular points and color points. 
		// Generate the objects as follows:
		// Each object has a 50% chance to be a Point or a ColorPoint
		// Both x and y coordinates are random ints between -10 and 10 inclusive
		// The color for a ColorPoint is randomly chosen among at least two colors.
		
		// Extra credit: Generate random colors that have an equal chance to 
		// take any value in the enum, regardless of how many there are 
		// in the enum.
		
		
		// Q5: write a loop to go through the array list that you generate 
		// in Q4 to do count how many blue (or any color of your choice) color points
		// there are. 
		// Print out the count after the loop.
		// Hint: use instanceof 
		
		
	}

}