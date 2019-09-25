package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;

    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public int getKnowledge() {
        return knowledge.getLevel();
    }

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", knowledge=" + knowledge.getLevel() +
                '}';
    }
}
