package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    String Name;
    int Roll_No;
    int Age;
    int Marks;
    Student(String Name,int Roll_No,int Age, int Marks){
        this.Name = Name;
        this.Roll_No = Roll_No;
        this.Age = Age;
        this.Marks = Marks;
    }
    // Overrides the toString() method inherited from the Object class
    public String toString() {
        return "Name: " + Name
                + ", Roll No: " + Roll_No
                + ", Age: " + Age
                + ", Marks: " + Marks;
    }

    @Override
    public int compareTo(Student o) {
        // return Integer.compare(this.Age, o.Age);
        if(this.Age-o.Age==0){
            return o.Marks-this.Marks;
        }
        return this.Age-o.Age;
    }
}

public class StudentClass{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>(10);
        list.add(new Student("Harsh",1,21,85));
        list.add(new Student("Rahul",2,20,80));
        list.add(new Student("Paul",3,21,84));
        list.add(new Student("Lee",4,20,95));
        list.add(new Student("Kapil",5,22,96));
        list.add(new Student("Gon",6,22,70));
        list.add(new Student("Rohit",7,21,75));
        list.add(new Student("Law",8,20,89));
        list.add(new Student("King",9,21,86));
        list.add(new Student("Jin",10,22,81));   
        Collections.sort(list);
        System.out.println();
        for(Student s:list){
            System.out.println(s);
        }
    }
}
   