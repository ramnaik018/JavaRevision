package Generics;

public class GenericMethods {
    public <T> void print(T name){
        // Here to initialise a method as generic, we need to place the Generic type of method <T>
        // in between the access modifier and the return type of the method.
        // we can also use non generic arguments as well.
        // > if the class is generic with type T , we can alsoo define a generic method of any type we want
        // ans use both of them in the same class.
        System.out.println(name);
    }
}
