/*
Create a Student class with the attributes name, roll_no, year, and course. Write setter and
getter methods for all the attributes. Print the parameter values after setting them with
appropriate values.
  */

class Student {
    // Attributes of the Student class
    private String name;
    private int roll_no;
    private int year;
    private String course;

    // Setter and Getter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Setter and Getter methods for roll_no
    public int getRollNo() {
        return roll_no;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    // Setter and Getter methods for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Setter and Getter methods for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Year: " + year);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student();

        // Set the student details using setter methods
        student.setName("Asad Rahmani");
        student.setRollNo(3027);
        student.setYear(3);
        student.setCourse("Computer Science AI ML");

        // Display student details after setting the values
        student.displayStudentDetails();
    }
}
