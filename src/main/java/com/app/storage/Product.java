package main.java.com.app.storage;

import java.util.HashMap;

public class Product {

    private Category category;
    private HashMap<String, String> idAndName;

    public Product(Category category, HashMap<String, String> idAndName) {
        this.category = category;
        this.idAndName = idAndName;
    }

    public Category getCategory() {
        return category;
    }

    public HashMap<String, String> getIdAndName() {
        return idAndName;
    }

    public String getName(String key) {
        return idAndName.get(key);
    }
}
