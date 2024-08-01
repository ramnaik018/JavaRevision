package Generics;

public interface GenericInterface <T,U>{
     T getKey();
     U getValue();
}

class OrderedPair<K,V> implements GenericInterface<K,V>{
    private K key;
    private V value;
    public OrderedPair(K key,V value){// constructor of generic class is declared same a normal constructors.
        this.key=key;
        this.value=value;
    }

    @Override
    public K getKey(){
        return this.key;
    }

    @Override
    public V getValue(){
        return this.value;
    }
}
