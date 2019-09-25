package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getAverageKnowledge() {
        double sumOfKnowledge = 0;

        for (Student student : students) {
            sumOfKnowledge += student.getKnowledge();
        }

        return sumOfKnowledge/students.size();
    }
}
