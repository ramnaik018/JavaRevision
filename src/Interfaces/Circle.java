package Interfaces;

public class Circle implements ShapeInterface{
    public void name(){
        System.out.println("This is circle");
    }
    @Override
    public void tell(){
        System.out.println("This is over riddent method of default tell from interface");
    }
}
