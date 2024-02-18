package app.model;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {

    public Map<Integer, AppProductModel> getData(){
        Map<Integer, AppProductModel> iphones = new HashMap<>();

        iphones.put(1510, new AppProductModel("iPhone 15 Plus", "Black", 11, 899.99));
        iphones.put(1511, new AppProductModel("iPhone 15 Plus", "Green", 12, 899.99));
        iphones.put(1512, new AppProductModel("iPhone 15 Plus", "Yellow", 8, 899.99));

        iphones.put(1520, new AppProductModel("iPhone 15 Pro", "Natural Titanium", 27, 999.99));
        iphones.put(1521, new AppProductModel("iPhone 15 Pro", "Blue Titanium", 29, 999.99));
        iphones.put(1522, new AppProductModel("iPhone 15 Pro", "White Titanium", 33, 999.99));

        iphones.put(1530, new AppProductModel("iPhone 15 Pro Max", "Natural Titanium", 21, 1199.99));
        iphones.put(1531, new AppProductModel("iPhone 15 Pro Max", "Blue Titanium", 23, 1199.99));
        iphones.put(1532, new AppProductModel("iPhone 15 Pro Max", "White Titanium", 19, 1199.99));

        return iphones;

    }
}
