package JarOfT;

import java.util.ArrayDeque;

public class Jar<T> {

    private ArrayDeque<T> items;

    public Jar() {

        this.items = new ArrayDeque<T>();
    }

    public void add(T element){

        this.items.push(element);



    }

    public T remove(){
        if(this.items.size()>0){
        return this.items.pop();
        }

        return null;
    }

}

