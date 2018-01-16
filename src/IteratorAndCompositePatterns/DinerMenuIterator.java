package IteratorAndCompositePatterns;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    public boolean hasNext(){
        return (position >= items.length || items[position] == null) ? false : true;
    }
}
