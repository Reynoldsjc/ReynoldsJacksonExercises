public class ConeTester {
    public static void main (String[] args) {
        Cone co = new Cone(6.0, -2.0);
        System.out.println("Slant Length: " + co.slantLength() + "  " + "Angle at the Apex: " + co.angle() );
    }
}