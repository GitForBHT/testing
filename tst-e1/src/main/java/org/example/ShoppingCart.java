package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    
    private List<Item> items = new ArrayList<>();

    public int getTotal() {
        
        int total = 0;
        for (Item item : items) {
            total += item.price(); 
        }
        return total;
    }
    

    public void addItem(Item item) {
        items.add(item);
    }

    
}
