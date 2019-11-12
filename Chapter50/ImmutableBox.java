public class ImmutableBox {
    // Instance Variables
    public double width;
    public double height;
    public double length;

    // Constructors
    public ImmutableBox (double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public ImmutableBox () {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    // Methods
    public double volume()
    {
        return width * length * height;
    }
    public double surfaceArea()
    {
        return 2 * (height * width) + 2 * (height * length) + 2 * (width * length);
    }
}