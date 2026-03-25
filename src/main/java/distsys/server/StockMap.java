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

    public static class Item {

        String name;
        double price;
        int quantity;
        String expiry_date;
        String location;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getExpiry_date() {
            return expiry_date;
        }

        public void setExpiry_date(String expiry_date) {
            this.expiry_date = expiry_date;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
        
        public String toString(){
            return "Item: " + name
                    + "\nPrice: " + price
                    + "\nQuantity: " + quantity
                    + "\nExprity Date: " + expiry_date
                    + "\nLocation: " + location;
        }
        
        
    }

    Map stockMap;

    public StockMap() {
        stockMap = new HashMap<String, Item>();

        Item apple = new Item();
        apple.name = "Apple";
        apple.price = 0.99;
        apple.quantity = 80;
        apple.expiry_date = "15-04-2026";
        apple.location = "Fruit";

        Item banana = new Item();
        banana.name = "Banana";
        banana.price = 2.30;
        banana.quantity = 100;
        banana.expiry_date = "15-04-2026";
        banana.location = "Fruit";

        Item kiwi = new Item();
        kiwi.name = "Kiwi";
        kiwi.price = 0.50;
        kiwi.quantity = 40;
        kiwi.expiry_date = "15-04-2026";
        kiwi.location = "Fruit";

        Item strawberry = new Item();
        strawberry.name = "Strawberry";
        strawberry.price = 1.50;
        strawberry.quantity = 120;
        strawberry.expiry_date = "15-04-2026";
        strawberry.location = "Fruit";

        stockMap.put("Apple", apple);
        stockMap.put("Banana", banana);
        stockMap.put("Kiwi", kiwi);
        stockMap.put("Strawberry", strawberry);

    }

    public Item getItemStatus(String name){
        Item answer = (Item) stockMap.get(name);
        return answer;
    }
    
    public boolean containsKey(String a){
        return stockMap.containsKey(a);
    }

}
