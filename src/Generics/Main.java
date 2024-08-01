package Generics;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Generic class example 1:
        // Use of generic classes is seen while instantiating the class by specifying the Type of argument
        GenericClasses<Integer> gInt=new GenericClasses<>();
        gInt.setName(2);
        System.out.println(gInt.getName());

        GenericClasses<String> gStr=new GenericClasses<>();
        gStr.setName("Ram");
        System.out.println(gStr.getName());


        //Generic class example 2:
        GenericPair<String ,Integer> countryPopulation=new GenericPair<>("India",100);
        System.out.println(countryPopulation.x+" "+countryPopulation.y);

        GenericPair<Double ,Character> random=new GenericPair<>(78.354,'F');
        System.out.println(random.x+" "+random.y);

        //Generic Methods:
        // The use of generic methods is not seen while instatiating the class , but seen while calling the
        // methods(generic type) using objects created and passing the different type of arguments.
        GenericMethods gm1=new GenericMethods();
        gm1.print("Ram");
        gm1.print(9);


        // Wild Cards -> ?
        // There are three types of generics
        // 1) Unbounded wildcard 2) UpperBound wildcard 3) lower bound wildcard


        List<Integer> lInt=new ArrayList<>();
        lInt.add(4);lInt.add(9);lInt.add(0);lInt.add(1);lInt.add(2);lInt.add(5);
        List<String> lStr=new ArrayList<>();
        lStr.add("Ram");lStr.add("Leela");lStr.add("Jay");lStr.add("Ravi");

        WildCards wc=new WildCards();
        wc.print(lInt);
        wc.print(lStr);

        // Bounded wildcards.
        BoundedWildCards bwc=new BoundedWildCards();
        System.out.println("--------------------------");
        bwc.print1(lInt);
        List<Number> num= new ArrayList<Number>();
        num.add(0);num.add(9);num.add(2);num.add(8);num.add(3);num.add(7);num.add(4);
        System.out.println("--------------------------");
        bwc.print2(num);


        OrderedPair<Integer,Integer> p1=new OrderedPair<>(4,9);
        OrderedPair<String,Double> p2=new OrderedPair<>("Ram",1.0);

        System.out.println(p1.getKey()+" "+p1.getValue());
        System.out.println(p2.getKey()+" "+p2.getValue());
        System.out.println("--------------------------");
        TypeErasure<String> te1=new TypeErasure<>();
        te1.setName("Ram");
        System.out.println(te1.getName());
        TypeErasure<Integer> te2=new TypeErasure<>();
        te2.setName(6);
        System.out.println(te2.getName());
    }

}
