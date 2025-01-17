public class ColorPoint extends Point {
	// Lab task 1, Q3: change the color to enum (pick any colors, at least three). 
	// Define the enum within the  ColorPoint class.
	// Fix the getColor method and the TestPoint class constructor accordingly.
	// Explain (in comments here or in a separate file) why enums are 
	// a better choice than strings to represent colors
	
	private enum colors
	{
		RED, 
		BLUE, 
		YELLOW, 
		GREEN, 
		BROWN, 
		MAROON
	}
	private colors color;

	
	public ColorPoint(int x, int y, colors color) {
		super(x, y); // call to the constructor of the superclass
		this.color = color;
	}
	
	// returns the color of a point
	public colors getColor() 
	{
		switch(color)
		{
			case RED:
				return colors.RED;
			case BLUE:
				return colors.BLUE;
			case YELLOW:
				return colors.YELLOW;
			case GREEN:
				return colors.GREEN;
			case BROWN:
				return colors.BROWN;
			case MAROON:
				return colors.MAROON;
		}
		return null;

	}
	
	public String toString() {
		return "ColorPoint: x = " + x + ", y = " + y + ", color = " + color;
	}


}
