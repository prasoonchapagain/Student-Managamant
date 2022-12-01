package models;

import java.util.ArrayList;

public class Section {

    ArrayList<Group> groups;
    String name;

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section(ArrayList<Group> groups, String name) {
        this.groups = groups;
        this.name = name;


    }
}
