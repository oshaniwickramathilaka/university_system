import java.util.ArrayList;

class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        this.coursesOffering = new ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }

    public void appointDepartmentHead(Lecturer lecturer) {
        departmentHead = lecturer;
        System.out.println(lecturer.getName() + " head of the department of " + name);
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
        System.out.println("Course " + course.getName() + " offered by " + name + " department.");
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
        System.out.println("Lecturer " + lecturer.getName() + " belongs to " + name + " department.");
    }

    public void displayInfo() {
        System.out.println("Department Name: " + name);
        if (departmentHead != null) {
            System.out.println("Department Head: " + departmentHead.getName());
        }
        System.out.println("Courses Offered:");
        for (Course course : coursesOffering) {
            System.out.println(course.getName());
        }
    }
}



