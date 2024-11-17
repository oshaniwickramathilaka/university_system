class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public String getName() {
        return name;
    }

    public void addLecturerInCharge(Lecturer lecturer) {
        this.lecturerInCharge = lecturer;
        System.out.println("Lecturer " + lecturer.getName() + " assigned to " + name + " course.");
    }

    public void displayInfo() {
        System.out.println("Course name is" + name);
        System.out.println("Enrollment type is" + enrollType);
        System.out.println("Number of students enrolled is" + numberOfStudentsEnrolled);
        if (lecturerInCharge != null) {
            System.out.println("Lecturer In Charge is " + lecturerInCharge.getName());
        }
    }
}