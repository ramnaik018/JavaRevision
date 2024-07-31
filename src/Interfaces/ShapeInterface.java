package Interfaces;

public interface ShapeInterface{
    void name();
    default public void tell(){
        System.out.println("This is printed usign default method from ShapeInterface");
    }
}


