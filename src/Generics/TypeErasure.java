package Generics;
//Type erasure is a concept in java where type information of variable are available at compile time and are erased at runtime
//this type is erased and replaced with their upperbound type ot Object type.
//This is done bcc the new java versions which uses generics should support backward compatibility.
public class TypeErasure <T>{
    private T name;
    public void setName(T name){
        this.name=name;
    }
    public T getName(){
        return this.name;
    }
    // here in .java file (Before compilation) we can see that this class is using generic varibale of type T
    // But after compilation (in .class) file, we will see that this generic type T is replaced with either upperbound type
    //or Object type if not upper bound is specified. This phenomenon happens to support backward compatibility.
    //  THIS IS CALLED TYPE ERASURE
}
