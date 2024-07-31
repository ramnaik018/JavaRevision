package Sorting;

public class College implements Comparable<College>{
    public String name;
    public int rank;
    public College(String name, int rank){
        this.name=name;
        this.rank=rank;
    }

    public int compareTo(College clg){
        return this.rank-clg.rank;
    }
}
