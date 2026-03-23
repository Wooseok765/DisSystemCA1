/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */



public class StockMap {
    
    private static class Item{
        String name;
        double price;
        int quantity;
        String expiry_date;
        String location;    
    }
    
    Map stockMap;
    
    public StockMap(){
        stockMap = new HashMap<String, Item>();
        
//        List<Item> item = new ArrayList<>();
        
        Item apple = new Item();
        apple.name = "Apple";
        apple.price = 0.99;
        apple.quantity = 80;
        apple.expiry_date = "15-04-2026";
        apple.location = "Fruit";
        
        Item banana = new Item();
        apple.name = "Banana";
        apple.price = 2.30;
        apple.quantity = 100;
        apple.expiry_date = "15-04-2026";
        apple.location = "Fruit";
        
        Item kiwi= new Item();
        apple.name = "Kiwi";
        apple.price = 0.50;
        apple.quantity = 40;
        apple.expiry_date = "15-04-2026";
        apple.location = "Fruit";
        
        Item strawberry = new Item();
        apple.name = "Strawberry";
        apple.price = 1.50;
        apple.quantity = 120;
        apple.expiry_date = "15-04-2026";
        apple.location = "Fruit";
        
//        item.add(apple);
//        item.add(kiwi);
//        item.add(banana);
//        item.add(strawberry);
        
        stockMap.put("Apple", apple);
        stockMap.put("Banana", banana);
        stockMap.put("Kiwi", kiwi);
        stockMap.put("Strawberry", strawberry);
        
        
    }
    
}
