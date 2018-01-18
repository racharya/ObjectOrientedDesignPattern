package IteratorAndCompositePatterns;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator {

    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(ArrayList items){
        this.items = items;
    }

    public Object next(){
        MenuItem item = items.get(position);
        position += 1;
        return item;
    }

    public boolean hasNext() {
        return (position >= items.size() || items.get(position) == null) ? false : true ;
    }
}
