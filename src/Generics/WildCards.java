package Generics;

import java.util.List;

public class WildCards {
    public void print(List<?> list){
        for(Object obj:list ){
            System.out.println(obj);
        }
    }
}

class BoundedWildCards{
    public void print1(List<? extends Number> list){
        for(Object obj:list ){
            System.out.println(obj);
        }
    }
    public void print2(List<? super Integer> list){
        for(Object obj:list ){
            System.out.println(obj);
        }
    }
}
