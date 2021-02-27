package funcionalProgramming.SavarankiskasDarbas;

import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentDatabase studentDatabase = new StudentDatabase();
        studentDatabase.getStudentList();
        System.out.println(studentDatabase);

    }
}
