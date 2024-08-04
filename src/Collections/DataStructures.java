package Collections;
import java.util.List;
import java.util.Stack;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;


public class DataStructures {
    public static void printLis(List<Integer> lis){
        for(Integer i:lis){
            System.out.println(i);
        }
    }
    public static void printSta(Stack<Integer> s){
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void printLL(LinkedList<Integer> ll){
        for(Integer e:ll){
            System.out.println(e);
        }
    }
    public static void printQ(Queue<Integer> q){
        for(Integer e:q){
            System.out.println(e);
        }
    }
    public static void printDq(Queue<Integer> dq){
        for(Integer e:dq){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("-------------------------------ArrayList");
        List<Integer> lis=new ArrayList<>();
        lis.add(8);lis.add(5);lis.add(2);lis.add(3);
        printLis(lis);
        System.out.println("-------------------------------LinkedList");
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(9);ll.addFirst(10);ll.addLast(11);
        ll.add(1,29);// adding 29 at index 1
        printLL(ll);
        System.out.println("-------------------------------Stack");
        Stack<Integer> s=new Stack<>();
        s.push(4);s.push(19);s.push(28);s.push(2);
        printSta(s);
        System.out.println("-------------------------------Queue");
        Queue<Integer> q=new LinkedList<>();
        q.add(9);q.add(98);q.add(1);q.add(38);
        q.remove();
        printQ(q);
        System.out.println("-------------------------------ArrayDeque");
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(9);dq.addFirst(10);dq.addFirst(3);
        dq.addLast(29);dq.addLast(98);
        printDq(dq);// 3 10 9 29 98
        System.out.println("-------------------------------Iterator");
        Iterator<Integer> it=lis.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Similarly we can also impliment HashSet , LinkedHashSet and TreeSet" +
                "Where HashSet is just a normal set and contains elements in random order" +
                "And LinkedHashSet contains elements in the way they are inserted " +
                "and TreeSet where it stores elements in a sorted manner.");


    }

}
