public class Circle implements Shape{
    protected int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }


    public double area()
    {
        return radius*radius*Math.PI;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

}
