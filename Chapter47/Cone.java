public class Cone {
    // Instance Variables
    private double radius;
    private double height;

    // Constructors
    public Cone (double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    // Methods
    public double slantLength()
    {
        return Math.sqrt(radius * radius + height * height );
    }
    public double angle()
    {
        double theta = 0.0;
        double value = radius/height;
        theta = java.lang.Math.atan(value);
        return theta * 180/Math.PI;
    }
}