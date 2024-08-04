package StreamsAndLamdas;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Predicate;

import static java.lang.Integer.parseInt;

@FunctionalInterface
interface rando{
    void fun();
}

public class Main {
    public static void printlis(List<?> lis){
        for(Object ele:lis){
            System.out.println(ele);
        }
    }
    public static void main(String[] args) {
        rando rn=new rando(){
            public void fun(){
                System.out.println("Hey");
            }
        };
        rn.fun();//this is traditional way of executing functional interface methods using anonymous class

        rando obj=()-> System.out.println("Hello");
        obj.fun();//This is lambda way of executing functional interfaces.

        List<Integer> lis=new ArrayList<>();
        lis.add(9);lis.add(1);lis.add(5);lis.add(3);lis.add(11);
        System.out.println("Before sorting:");
        printlis(lis);

        Comparator<Integer> cmp=(Integer a,Integer b)-> a-b;//This Comparator Interface is implemented using lambdas
        Collections.sort(lis,cmp);
        System.out.println("After sorting:");
        printlis(lis);

        //we know Runnable and Callable are also FunctionalInterfaces with run() and call() methods respectively
        //if i want to excute some stuff in another thread , instead of creating new class which implements Runnable and
        // overriding run method in and stuffing code in that run,
        // we can directly make use of lamdas to create new thread here
        Runnable rnb=new Runnable(){
            public void run(){
                System.out.println("This is running in "+Thread.currentThread().getName()+" Thread");
            }
        };
        Thread t=new Thread(rnb);
        t.start();
        Runnable rnb1= () -> System.out.println("This is running in "+Thread.currentThread().getName()+" Thread");

        Thread t1=new Thread(rnb1);
        t1.start();

        System.out.println("This is running in "+Thread.currentThread().getName()+" Thread");

        //So for all functional interfaces, we can override their methods by creating obj instances of them directly using anonymous
        //method functionality and we can reduce number of lines of code using lambdas.

        //Lamdas with Stream API
        System.out.println("--------------------------------------filtering and mapping");

        List<String> names=Arrays.asList("Adam","Ram","Akhil","Praveen","Avinash");

        List<String> filteredNames=names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        printlis(filteredNames);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reNumbers=numbers.stream()
                .map(n -> n*n)
                .toList();
        printlis(reNumbers);

        System.out.println("--------------------------------------Finding and Matching");

        List<String> words = Arrays.asList("banana", "apple", "cherry", "date", "elderberry");

        boolean allMatchBool=words.stream()
                .allMatch(word -> word.startsWith("a"));
        System.out.println("does all words matched with given condition :"+allMatchBool);

        boolean anyMatchBool=words.stream()
                .anyMatch(word -> word.startsWith("h",1));
        System.out.println("does all words matched with given condition :"+anyMatchBool);

        System.out.println("-------------------------------------Reducing");

        int totSum=numbers.stream()
                .map(n -> n*2)
                .reduce(2, (num1,num2)-> num1+num2);
        System.out.println("total sum after doing summation :"+totSum);

        System.out.println("-------------------------------------Sorting");

        List<String> sortedLis=words.stream()
                                    .sorted((str1,str2)-> str1.length()-str2.length())
                                    .toList();
        printlis(sortedLis);
        System.out.println("-------------------------------------Grouping By from a list based on some criteria");

        Map<Integer,List<String>> mp=words.stream()
                .collect(Collectors.groupingBy(String::length)); //word-> word.length()

        System.out.println(mp);
        System.out.println("-------------------------------------Inbuilt Functional Interafces");

        Function <String ,Integer> funStrInt= str-> parseInt(str);
        Supplier<String> strGen= () -> "Ram";
        Predicate<String> isLenFour= word -> word.length()==4;


        System.out.println(funStrInt.apply("234"));
        System.out.println(strGen.get());
        System.out.println(isLenFour.test("Ram"));
        System.out.println(isLenFour.test("Leel"));
        System.out.println("-------------------------------------Method ParallelStreams");

        System.out.println("Executed using sequential stream------------------");

        words.stream().
                forEach(element -> System.out.println(element +" is executed by Thread : "+Thread.currentThread().getName()));

        System.out.println("Executed using Parallel stream------------------");

        words.parallelStream().
                forEach(element -> System.out.println(element +" is executed by Thread : "+Thread.currentThread().getName()));
        System.out.println(words.stream().collect(Collectors.joining(",","[","]")));
        System.out.println(words.stream().collect(Collectors.partitioningBy(str -> str.length()>5)));
        //partitioningBy() takes in a predicate which is used to group elements into map of keys true and false
        // i.e map<boolean,List<String>>
        System.out.println(numbers.stream().collect(Collectors.summingInt(Integer::intValue)));
    }

}
