import java.util.ArrayList;

public class TestRectangleSquareCircle {

	public static void main(String[] args) {
		// Liskov substitution principle
		// (Barbara Liskov, MIT computer scientist):
		// If a property of objects of type T holds in all possible tests
		// and S is a subtype of T then the same property must also hold 
		// for all objects of type S	
		
		System.out.println("Rectangle:");
		
		// create a rectangle
		Rectangle r1 = new Rectangle(2, 5);
				
		// get its area and perimeter
		System.out.println("area = " + r1.area());
		System.out.println("perimeter = " + r1.perimeter());
		
		r1.setSide1(3);
		
		System.out.println("Rectangle after the change:");
		
		// get its area and perimeter
		System.out.println("area = " + r1.area());
		System.out.println("perimeter = " + r1.perimeter());
		
		// Are two sides equal? 
		System.out.println("Are two sides equal? " + r1.sidesEqual());		
		
		System.out.println("Square:");
		
		// create a square
		Square s1 = new Square(2);
				
		// get its area and perimeter
		System.out.println("area = " + s1.area());
		System.out.println("perimeter = " + s1.perimeter());
		
		s1.setSide(3);
		
		System.out.println("Square after the change:");
		
		// get its area and perimeter
		System.out.println("area = " + s1.area());
		System.out.println("perimeter = " + s1.perimeter());
		
		// Are two sides equal? 
		System.out.println("Are two sides equal? " + s1.sidesEqual());	
		
		// Which of the classes should be a subtype of the other one? 
		// Use the Liskov substitution principle to answer this question
		// Answered in LabTask2.txt
		

		//Lab task 2, Question2C
		
		ArrayList<Shape> shapes = new ArrayList<>();
		//Squares
		for(int i = 0; i < 5; i++)
		{
			int x = (int) (Math.random() * 10) + 1;
			shapes.add(new Square(x));
		}
		//Rectangles
		for(int i = 0; i < 5; i++)
		{
			int x = (int) (Math.random() * 10) + 1;
			int y = (int) (Math.random() * 10) + 1;
			shapes.add(new Rectangle(x, y));
		}
		//Circles
		for(int i = 0; i < 5; i++)
		{
			int x = (int) (Math.random() * 5) + 1;
			shapes.add(new Circle(x));
		}
		//Areas and permimeters
		for(Shape shape : shapes)
		{
			System.out.println("Shape's area: " + shape.area() + "\nShape's perimeter: " + shape.perimeter());
		}

	}

}