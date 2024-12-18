import java.util.ArrayList;
import java.util.List;

// Superclass College
class College {
    // Constant for the college
    public static final String MY_COLLEGE = "Tech Innovations University";

    // Data members
    private String collegeName;
    private String address;
    private List<Department> departments;
    private List<Faculty> faculty;

    // Constructor
    public College(String collegeName, String address) {
        this.collegeName = collegeName;
        this.address = address;
        this.departments = new ArrayList<>();
        this.faculty = new ArrayList<>();
    }

    // Method to display college details
    public void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Address: " + address);
        System.out.println("Total Departments: " + departments.size());
        System.out.println("Total Faculty: " + faculty.size());
    }

    // Getters and setters
    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty facultyMember) {
        faculty.add(facultyMember);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Faculty> getFaculty() {
        return faculty;
    }
}

// Department class inheriting College
class Department extends College {
    private int totalDepartments;
    private String departmentName;
    private String hodName;

    // Constructor
    public Department(String collegeName, String address, 
                      int totalDepartments, String departmentName, String hodName) {
        super(collegeName, address);
        this.totalDepartments = totalDepartments;
        this.departmentName = departmentName;
        this.hodName = hodName;
    }

    // Method to display department details
    public void display() {
        // First display college details
        displayCollegeDetails();
        
        // Then display department-specific details
        System.out.println("Total Departments: " + totalDepartments);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Head of Department: " + hodName);
    }
}

// Faculty class inheriting Department
class Faculty extends Department {
    private int totalFaculty;
    private String facultyName;
    private int yearsWorked;

    // Constructor
    public Faculty(String collegeName, String address, 
                   int totalDepartments, String departmentName, String hodName,
                   int totalFaculty, String facultyName, int yearsWorked) {
        super(collegeName, address, totalDepartments, departmentName, hodName);
        this.totalFaculty = totalFaculty;
        this.facultyName = facultyName;
        this.yearsWorked = yearsWorked;
    }

    // Method to display faculty details
    public void display() {
        // First display department details
        super.display();
        
        // Then display faculty-specific details
        System.out.println("Total Faculty: " + totalFaculty);
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Years Worked: " + yearsWorked);
    }
}

// Main class to demonstrate the usage
public class CollegeHierarchyDemo {
    public static void main(String[] args) {
        // Create a Faculty object
        Faculty facultyMember = new Faculty(
            "Tech Innovations University", // College Name
            "123 Innovation Road", // Address
            5, // Total Departments
            "Computer Science", // Department Name
            "Dr. John Smith", // HOD Name
            50, // Total Faculty
            "Prof. Emily Wong", // Faculty Name
            10 // Years Worked
        );

        // Display details
        System.out.println("College Constant: " + College.MY_COLLEGE);
        facultyMember.display();
    }
}
