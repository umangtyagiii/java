import java.util.*;
public class oop1 {
    public static void main(String [] args){
        student s1 = new student(70,"Suryansh",20.0f);
        student s2 = new student(s1);
        System.out.println("Student 1 Name: " + s1.name + " Roll Number: " + s1.rollno + " Marks: " + s1.marks);
        System.out.println("Random name: " + s2.name);
    }
}
class student{
    int rollno;
    String name;
    float marks;
    student(student other){
        this.rollno=other.rollno;
        this.name=other.name;
        this.marks=other.marks;
    }
    student(int rollno, String name, float marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
}
