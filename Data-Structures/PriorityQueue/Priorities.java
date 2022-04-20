package PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Priorities {

    private final PriorityQueue<Student> queue = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getID));

    public List<Student> getStudents(List<String> events) {
        events.forEach((event) -> {
            if (event.equals("SERVED")) {
                queue.poll(); //deletes the element in this instance
            } else {
                String[] details = event.split(" ");

                queue.add(new Student(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
            }
        });
        System.out.println("queue: " + queue);


        List<Student> students = new ArrayList<>();
        System.out.println("students: " + students);

        while (!queue.isEmpty()) {
            students.add(queue.poll()); //return the head of the lista dn add to the student's list
            System.out.println("queue: " + queue);
            System.out.println("students: " + students);
        }
        System.out.println("queue: " + queue);
        System.out.println("students: " + students);
        return students;
    }
}