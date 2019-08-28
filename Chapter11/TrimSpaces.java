public class TrimSpaces {
    public static void main(String[] args) {
        String first = new String ("    I   love   Mountain   Vista High  School    ");
        String second;
        second = first.trim();
        System.out.println(second);
    }
}