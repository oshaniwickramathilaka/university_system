class Lecturer extends Person {
    public Lecturer(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer name is " + getName());
    }
}