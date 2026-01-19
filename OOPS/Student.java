package OOPS;

import java.util.*;

public class Student {
    int rollno;
    String name;
    float marks;

    void study(){
        System.out.print("Start OOPs");
    }
    
    public static void main(String[] args) {

        Student stud= new Student();
    

        System.out.println(stud.rollno=10);
        System.out.println(stud.name="Yogs");
        System.out.println(stud.marks=90.45f);

        stud.study();
        
    }

    
}
