import java.util.ArrayList;

class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
        System.out.println("Course " + course.getName() + " added to " + name + " degree.");
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
        System.out.println("Course " + course.getName() + " removed from " + name + " degree.");
    }

    public void displayInfo() {
        System.out.println("Degree name is " + name);
        System.out.println("Number of students is " + numberOfStudents);
        System.out.println("Courses offered are ");
        for (Course course : coursesOffering) {
            System.out.println( course.getName());
        }
    }
}