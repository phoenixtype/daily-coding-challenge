package PriorityQueue;

public class Student {
    private int ID;
    private String name;
    private double CGPA;

    public Student(int ID, String name, double CGPA) {
        this.ID = ID;
        this.name = name;
        this.CGPA = CGPA;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }
}
