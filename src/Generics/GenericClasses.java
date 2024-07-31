package Generics;

public class GenericClasses<T> {

    public T name;
    public T getName(){
        return this.name;
    }
    public void setName(T name){
        this.name=name;
    }

}

class GenericPair<T,U>{
    T x;
    U y;
    GenericPair(T x,U y){
        this.x=x;
        this.y=y;
    }
}
