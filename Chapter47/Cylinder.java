public class Cylinder {
    // Instance Variables
    private double radius;
    private double height;

    // Constructors
    public Cylinder (double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    // Methods
    public double surfaceArea()
    {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    
    public double volume()
    {
        return Math.PI * radius * radius * height;
    }
  
}