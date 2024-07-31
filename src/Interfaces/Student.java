package Interfaces;

public class Student implements Comparable<Student>{
    public String name;
    public int rank;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    public int compareTo(Student s){
        return this.rank-s.rank;
    }
}
