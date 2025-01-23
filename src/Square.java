/*
 * A class that represents a square with an integer side.
 */

public class Square extends TwoSidedShape {
	protected int side;
	
	/*
	 * A constructor that takes the side
	 */
	public Square(int side) {
		this.side = side;
	}
	
	/*
	 * The set method to set the sides of a square
	 */
	public void setSide(int side) {
		this.side = side;
	}

	/*
	 * Returns true since the two sides of a square are always equal
	 */
	public boolean sidesEqual() {
		return true;
	}

	@Override
	public double getSide1() {
		return side;
	}

	@Override
	public double getSide2() {
		return side;
	}
}
