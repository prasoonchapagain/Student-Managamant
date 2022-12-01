import models.Group;
import models.Section;
import models.Students;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Students s1 = new Students("Prasoon",17,1);
        Students s2 = new Students("Aashutosh",18,2);
        Students s3 = new Students("Sambridhi",15,3);
        Students s4 = new Students("Diya",17,4);
        Students s5 = new Students("Kunjal",17,5);

        Students s6 = new Students("Ishan",17,6);
        Students s7 = new Students("Bhola",20,7);
        Students s8 = new Students("Aashraya",17,8);
        Students s9 = new Students("Arunesh",18,9);
        Students s10 = new Students("Pranjal",17,10);

        Students s11 = new Students("Sushant",18,11);
        Students s12 = new Students("Anshu",17,12);
        Students s13 = new Students("Avarna",16,13);
        Students s14 = new Students("Aaditya",17,14);
        Students s15= new Students("Biplov",18,15);

        ArrayList<Students> studentslist1 = new ArrayList<Students>();
        studentslist1.add(s1);
        studentslist1.add(s2);
        studentslist1.add(s3);
        studentslist1.add(s4);
        studentslist1.add(s5);

        ArrayList<Students> studentslist2 = new ArrayList<Students>();
        studentslist1.add(s6);
        studentslist1.add(s7);
        studentslist1.add(s8);
        studentslist1.add(s9);
        studentslist1.add(s10);

        ArrayList<Students> studentslist3 = new ArrayList<Students>();
        studentslist1.add(s11);
        studentslist1.add(s12);
        studentslist1.add(s13);
        studentslist1.add(s14);
        studentslist1.add(s15);


        Group groupA = new Group(studentslist1,"A");
        Group groupB = new Group(studentslist2,"B");
        Group groupC = new Group(studentslist3,"C");

        ArrayList<Group> groups = new ArrayList<Group>();
        groups.add(groupA);
        groups.add(groupB);
        groups.add(groupC);


        Section section1 = new Section(groups,"Lobuche");

    }
}
