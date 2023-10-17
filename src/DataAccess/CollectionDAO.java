package DataAccess;

import common.Library;
import java.util.ArrayList;
import java.util.Collections;
import model.Student;

public class CollectionDAO {
    private static CollectionDAO instance = null;
    Library l;

    public CollectionDAO() {
        l = new Library();
    }

    public static CollectionDAO Instance() {
        if (instance == null) {
            synchronized (CollectionDAO.class) {
                if (instance == null) {
                    instance = new CollectionDAO();
                }
            }
        }
        return instance;
    }

    public ArrayList<Student> addStudent(ArrayList<Student> lt) {
        while (true) {
            System.out.println("Please input student information");
            String name = l.inputString("Name: ");
            String classes = l.inputString("Classes: ");
            double mark = l.checkInputDouble("Mark: ");
            lt.add(new Student(name, mark, classes));
            if (!l.checkInputYN("Do you want to enter more student information?(Y/N): ")) {
                return lt;
            }
        }

    }

    public void print(ArrayList<Student> lt) {
        if (lt.isEmpty()) {
            System.err.println("There are no student!!!");
            return;
        }
        Collections.sort(lt);
        for (int i = 0; i < lt.size(); i++) {
            int n = i + 1;
            System.out.println("--------Student " + n + "--------");
            System.out.println("Name: " + lt.get(i).getName());
            System.out.println("Classes: " + lt.get(i).getClasses());
            System.out.println("Mark: " + lt.get(i).getMark());
        }
    }

    public void display(ArrayList<Student> lt) {
        print(addStudent(lt));
    }
}

