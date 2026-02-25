class Student {
    
    // Declaration of private attributes
    private String name;
    private int studentId;
    private double gpa;

    // Parameterized Constructor
    Student(String name, int studentId, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Setter And Getter Methods for all three attributes
    // set Name
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    // Set id
    void setStudentID(int studentId){
        this.studentId = studentId;
    }
    int getStudentID(){
        return studentId;
    }
    
    // set gpa
    void setGpa(double gpa){
        this.gpa = gpa;
    }
    double getGpa(){
        return gpa;
    }
    // calculate total overlading function.

    // Adds two integers
    int calculateTotal(int a, int b) {
        return a + b;
    }

    // Adds two double values
    double calculateTotal(double a, double b) {
        return a + b;
    }

    // Adds three integers
    int calculateTotal(int a, int b, int c) {
        return a + b + c;
    }
    
    
    // Finds highest valid GPA
    double processGPAs(double[] gpas) {

        double highest = 0.0;

        for (double gpa : gpas) {

            if (gpa > 4.0) {
                break;
            }

            if (gpa < 1.0) {
                continue;
            }

            if (gpa > highest) {
                highest = gpa;
            }
        }
        return highest;
    }

    // Creates an uneven (jagged) 2D array
    int[][] createUnevenArray() {

        int[][] arr = new int[3][];
        
        arr[0] = new int[]{1, 2};
        arr[1] = new int[]{3, 4, 5, 6};
        arr[2] = new int[]{7, 8, 9};

        return arr;
    }

    // Displays uneven array
    void displayUnevenArray(int[][] arr) {

        System.out.println("Uneven Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Row " + i + ": ");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Demonstrates type conversion
    String[] convertTypes() {

        int a = 10;
        double b = a;           // int to double (automatic)

        double c = 9.7;
        int d = (int) c;        // double to int (casting)

        char ch = 'A';
        int e = (int) ch;       // char to int

        String[] result = new String[3];
        result[0] = "int to double: " + b;
        result[1] = "double to int: " + d;
        result[2] = "char to int: " + e;

        return result;
    }

    // Demonstrates type promotion
    String demonstrateTypePromotion() {

        byte x = 10;
        short y = 20;
        int z = 30;

        long total = x + y + z;   // automatic promotion to long

        int i = 10;
        float f = 5.5f;
        double sum = i + f;       // automatic promotion to double

        return "Type Promotion:\n"
                + "long value: " + total + "\n"
                + "double value: " + sum;
    }
    char calculateGrade(){
        if(gpa >= 3.7){
            return 'A';
        }
        else if(gpa >= 3.0){
            return 'B';
        }
        else if(gpa >= 2.0){
            return 'C';
        }
        else if (gpa >= 1.0){
            return 'D';
        }
        else{
            return 'F';
        }
    }

boolean isHonorStudent(){
        boolean result =((gpa >= 3.7) ? true : false);
        return result;
    }

String getStatus(){
        if(gpa >= 3.7){
            return "Excellent!";
        }
        else if(gpa >= 3.0){
            return "Good";
        }
        else if(gpa >= 2.0){
            return "Average";
        }
        else {
            return "Needs Improvement!";
        }
    }

    // complete student report method:  
    String completeStudentReport() {

         String report = "";

         // Basic student information
         report += "Name: " + name + "\n";
         report += "ID: " + studentId + "\n";
         report += "GPA: " + gpa + "\n";

        // Using previous methods
        report += "Grade: " + calculateGrade() + "\n";
        report += "Status: " + getStatus() + "\n";

        if (isHonorStudent()) {
        report += "Honor Student: Yes\n";
        } else {
        report += "Honor Student: No\n";
        }
        return report;
    }
}
// Main class
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John Doe", 12345, 3.75);
        Student s2 = new Student("Jane Smith", 12346, 3.90);
        
        // Display complete information
        System.out.println("=== Student 1 ===");
        System.out.println(s1.completeStudentReport());
        
        System.out.println("\n=== Student 2 ===");
        System.out.println(s2.completeStudentReport());
        
        // Demonstrate uneven arrays
        int[][] uneven = s1.createUnevenArray();
        s1.displayUnevenArray(uneven);
        
        // Demonstrate type conversion
        String[] conversions = s1.convertTypes();
        for (String conv : conversions) {
            System.out.println(conv);
        }
        
        // Demonstrate type promotion
        String promotion = s1.demonstrateTypePromotion();
        System.out.println(promotion);
        
        // Array operations
        double[] gpas = {3.5, 3.8, 2.9, 3.95};
        double highest = s1.processGPAs(gpas);
        System.out.println("Highest GPA from array: " + highest);
        
        // Method overloading demonstration
        System.out.println("Overloaded methods:");
        System.out.println(s1.calculateTotal(10, 20));
        System.out.println(s1.calculateTotal(10.5, 20.5));
        System.out.println(s1.calculateTotal(10, 20, 30));
    }
}