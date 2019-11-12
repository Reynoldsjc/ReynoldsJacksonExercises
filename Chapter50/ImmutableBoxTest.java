class ImmutableBoxTest{
    public static void main ( String[] args ) {
     ImmutableBox box = new ImmutableBox ( 2.5, 5.0, 6.0 ) ;
     ImmutableBox anotherbox = new ImmutableBox ( 2, 5.6, 8.0 ) ;
     System.out.println( "Surface Area: "  + box.surfaceArea() + " volume: " + box.volume() );
    System.out.println( "Surface Area: "  + anotherbox.surfaceArea() + " volume: " + anotherbox.volume() );
  }
}