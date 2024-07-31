
package Interfaces;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student s1=new Student("Ram",2);
        Student s2=new Student("Leela",1);
        Student s3=new Student("Ravi",3);
        Student s4=new Student("krishna",4);
        Student s5=new Student("prem",10);
        list.add(s1);list.add(s2);list.add(s3);list.add(s4);list.add(s5);
        System.out.println("Before sorting:" +list);
        for(Student s:list){
            System.out.print(s.name +" "+s.rank+" ");
        }
        System.out.println();
        Collections.sort(list);
        System.out.println("After sorting:");
        for (Student student : list) {
            System.out.print(student.name + " "+student.rank+" ");
        }

    }
}
