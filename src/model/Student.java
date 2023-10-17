package model;

public class Student implements Comparable<Student> {

    private String name;
    private double mark;
    private String classes;

    public Student() {
    }

    public Student(String name, double mark, String classes) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

}
