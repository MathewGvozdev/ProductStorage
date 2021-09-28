package main.java.com.app.storage;

public class Product {

    private Category category;
    private int id;
    private String name;

    public Product(Category category, int id, String name) {
        this.category = category;
        this.id = id;
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
