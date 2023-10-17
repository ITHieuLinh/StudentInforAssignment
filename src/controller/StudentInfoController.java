package controller;

import Repository.CollectionRepository;
import java.util.ArrayList;
import model.Student;

public class StudentInfoController {
    CollectionRepository program;
    ArrayList<Student> lt;

    public StudentInfoController() {
        program = new CollectionRepository();
        lt = new ArrayList<>();
    }

    public void run() {
        System.out.println("\n====== Collection Sort Program ======");
        program.display(lt);
    }
}
