package Task1;

public class MyArrayList<E> {

    private E[] array;

    private int lastindex = -1;

    public MyArrayList (E[] array){
        this.array = array;
    }
    public int capacity(){
        return this.array.length;
    }

    public int size(){
        return lastindex+1;
    }
    public void add (E e){
        array[++lastindex] = e;
    }

    public E get(int index){
        return array[index];
    }
}
