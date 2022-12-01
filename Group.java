package models;

import java.util.ArrayList;

public class Group {

    ArrayList<Students> students;
    String name;

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group(ArrayList<Students> students, String name) {
        this.students = students;
        this.name = name;
    }
}
