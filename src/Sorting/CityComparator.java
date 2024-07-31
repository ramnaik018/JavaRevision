package Sorting;

import java.util.Comparator;

public class CityComparator implements Comparator<City>{
    public int compare(City c1, City c2){
         if(c1.population<c2.population){
             return -1;
         }else if (c1.population.equals(c2.population)){
             return 0;
         }else{
             return 1;
         }
    }
}
