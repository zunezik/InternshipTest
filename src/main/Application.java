package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", new Knowledge(5)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(8)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(10)));

        Internship internship = new Internship("Interlink");

        for (Student student : university.getStudents()) {
            if (student.getKnowledge() > university.getAverageKnowledge()) {
                internship.setStudent(student);
            }
        }

        System.out.println("List of internship's students:");
        System.out.println(internship.printStudents());
    }
}
