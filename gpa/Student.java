public class Student {
    
    // data
    private String name;
    private int gradeLevel;
    
    private double mathScore;
    private double englishScore;
    private double csScore;

    // constructor
    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;

        this.mathScore = 4;
        this.englishScore = 3;
        this.csScore = 4;
    }
    // functions - abilities

    //  getters or setters
    public String getName() {
        return this.name;
    }
    public int gradeLevel() {
        return this.gradeLevel;
        }
    public void setName(String name) {
        this.name = name;
    }
    public void setGradeLevel(int gradeLevel) {
        if (gradeLevel >= 9 && gradeLevel <= 12)
        this.gradeLevel = gradeLevel;
    }
    
    // calculate gpa
    public double calculateGPA() {
        System.out.println("Bill");
        return (mathScore + englishScore + csScore) / 3;
        
        }
    }

}