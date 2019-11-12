public class CylinderTester {
    public static void main (String[] args) {
        Cylinder cy = new Cylinder(6.0, 6.0);
        System.out.println("Volume: " + cy.volume() + "  " + "Surface Area: " + cy.surfaceArea() );
    }
}