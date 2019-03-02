package pr02_Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIterator<T> implements Iterable<T> {
    private List<T> elements;
    private int currentIndex;

    public ListyIterator(T... elements){
        this.elements = Arrays.asList(elements);
        this.currentIndex = 0;
    }

    public boolean move(){
        if(hasNext()){
            this.currentIndex++;
            return true;
        }

        return false;
    }

    public boolean hasNext(){
        return currentIndex < elements.size() - 1;

    }

    public void print(){
        if(this.elements.size() == 0){
            throw new IllegalStateException("Invalid Operation!");
        }

        System.out.println(this.elements.get(this.currentIndex));
    }

    public void printAll(){
        this.forEach(x-> System.out.print(x + " "));
        System.out.println();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        this.elements.forEach(action::accept);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index;

            @Override
            public boolean hasNext() {
                return this.index < elements.size();
            }

            @Override
            public T next() {
                return elements.get(index);
            }
        };
    }
}
