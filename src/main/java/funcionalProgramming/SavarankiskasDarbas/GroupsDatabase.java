package funcionalProgramming.SavarankiskasDarbas;

import java.util.ArrayList;
import java.util.List;

public class GroupsDatabase {
    private static List<Group> grupiuSaras = new ArrayList<>();
    private static Group group1 = new Group(StudentDatabase.getStudentuSarasas1(), TrainerDatabase.getTrainer1(), "Group1");
    private static Group group2 = new Group(StudentDatabase.getStudentuSarasas2(), TrainerDatabase.getTrainer2(), "Group2");
    private static Group group3 = new Group(StudentDatabase.getStudentuSarasas3(), TrainerDatabase.getTrainer3(), "Group3");

    public static void GoupsAssignment() {


        grupiuSaras.add(group1);
        grupiuSaras.add(group2);
        grupiuSaras.add(group3);
    }

    public static List<Group> getGrupiuSaras() {
        return grupiuSaras;
    }

    public static Group getGroup1() {
        return group1;
    }

    public static Group getGroup2() {
        return group2;
    }

    public static Group getGroup3() {
        return group3;
    }
}
