public abstract class TwoSidedShape implements Shape {
    public abstract double getSide1();
    public abstract double getSide2();

    public double perimeter() {
        return getSide1() + getSide2();
    }

    public double area() {
        return getSide1() * getSide2();
    }
}

