package Sorting;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
        List<College> clgs=new ArrayList<College>(){};   //Sorted clgs using Comparable
        List<City> cities=new ArrayList<City>(){};       //Sorted cities using Comparator
        clgs.add(new College("IIT Guw",1));
        clgs.add(new College("IIT Bom",6));
        clgs.add(new College("IIT Hyd",4));
        clgs.add(new College("IIT Kan",3));
        clgs.add(new College("IIT Khg",5));
        clgs.add(new College("IIT Bhu",2));

        cities.add(new City("Guw",75.34));
        cities.add(new City("Bom",75.36));
        cities.add(new City("Hyd",24.032));
        cities.add(new City("Kan",98.0));
        cities.add(new City("Khg",1.0));
        cities.add(new City("Bhu",28.987));
        System.out.println("Before sorting");
        for(College clg:clgs){
            System.out.println(clg.name+" "+clg.rank);
        }
        for(City c:cities){
            System.out.println(c.name+" "+c.population);
        }

        Collections.sort(clgs);
        cities.sort(new CityComparator());

        System.out.println("After sorting");
        System.out.println();
        for(College clg:clgs){
            System.out.println(clg.name+" "+clg.rank);
        }
        for(City c:cities){
            System.out.println(c.name+" "+c.population);
        }


    }
}
