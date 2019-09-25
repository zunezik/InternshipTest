package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        students.add(student);
    }

    public String printStudents() {
        return students.stream()
                .map(s -> s.toString())
                .reduce("", (x,y) -> x + y + "\n");
    }
}
