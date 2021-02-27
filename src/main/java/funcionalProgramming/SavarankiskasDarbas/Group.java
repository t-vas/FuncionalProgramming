package funcionalProgramming.SavarankiskasDarbas;

import java.util.List;

public class Group {
    private List<Student> student;
    private Trainer trainer;
    private String name;

    public Group(List<Student> student, Trainer trainer, String name) {
        this.student = student;
        this.trainer = trainer;
        this.name = name;
    }

    public List<Student> getStudent() {
        return student;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public String getName() {
        return name;
    }
}

