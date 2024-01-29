// The `import` statements in Java are used to bring in external classes or packages into your code. In
// this case, the code is importing classes from the `java.time` package, which is part of the Java 8
// Date and Time API.
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * The Student class represents a student with a name and date of birth.
 */
public class Student {
    public String name;
    public String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    /**
     * The Student class in Java represents a student with a name and date of birth, and provides methods
     * to display the student's name and calculate their age.
     */
    }

   /**
    * The function takes a date of birth as input and calculates the age of a student based on the
    * current date.
    * 
    * @param dob The parameter "dob" is a string representing the date of birth of a student in the
    * format "dd-MM-yyyy".
    */
    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age +"years");


    }

// The `main` method is the entry point of a Java program. It is the method that is executed when the
// program is run.
    public static void main(String[] args) {
        Student s=new Student();
        s.name = "Muskan B";
        s.displayName();
        s.displayAge("01-08-2004");

    }
}
