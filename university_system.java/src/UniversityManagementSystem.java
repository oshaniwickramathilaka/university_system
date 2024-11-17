public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Department
        Department softwareEngineering = new Department("Software Engineering");

        // Create Degree
        Degree computerScience = new Degree("Computer Science", 120);

        // Create Courses
        Course oop = new Course("Object-Oriented Programming", "Full-Time", 50);
        Course algorithms = new Course("Algorithms", "Full-Time", 60);

        // Create Lecturers
        Lecturer lecturer1 = new Lecturer("Dr. Alice");
        Lecturer lecturer2 = new Lecturer("Dr. Bob");

        // Create Students
        Student student1 = new Student("John Doe", 101);
        Student student2 = new Student("Jane Smith", 102);



        softwareEngineering.appointDepartmentHead(lecturer1);
        softwareEngineering.offerCourse(oop);
        softwareEngineering.offerCourse(algorithms);
        softwareEngineering.addLecturer(lecturer1);
        softwareEngineering.addLecturer(lecturer2);

        computerScience.offerCourse(oop);
        computerScience.offerCourse(algorithms);

        oop.addLecturerInCharge(lecturer1);
        algorithms.addLecturerInCharge(lecturer2);




        softwareEngineering.displayInfo();
        computerScience.displayInfo();
        oop.displayInfo();
        algorithms.displayInfo();
        lecturer1.displayInfo();
        student1.displayInfo();
    }
}
