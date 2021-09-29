package main.java.com.app.storage;

import java.util.ArrayList;

public class Storage {

    private static Storage STORAGE;
    private static ArrayList<Category> categoryList = new ArrayList<>();
    private static ArrayList<Product> productList = new ArrayList<>();

    private Storage() {}

    public static Storage getStorage() {
        if (STORAGE == null) {
            STORAGE = new Storage();
        }
        return STORAGE;
    }

    public static void addCategory(Category category) {
        categoryList.add(category);
        String name = category.getName();
        String format = String.format("Добавлена категория \"%s\".", name);
        System.out.println(format);
    }

    public static ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public static void printCategoryList(ArrayList<Category> list) {
        System.out.println("Список категорий: ");
        for (Category category : list) {
            System.out.println((list.indexOf(category) + 1) + ". " + category.getName());
        }
    }

    public static void addProduct(Product product) {
        productList.add(product);
        String name = product.getName(product.getIdAndName().get(productList.indexOf(product)));
        String category = product.getCategory().getName();
        String format = String.format("Продукт \"%s\" добавлен в категорию \"%s\".", name, category);
        System.out.println(format);
    }

    public static ArrayList<Product> getProductList() {
        return productList;
    }

    public static void printProductList(ArrayList<Product> list) {
        System.out.println("Список продуктов: ");
        for (Product product : list) {
            System.out.println((list.indexOf(product) + 1) + ". " + product.getIdAndName().get(product));
        }
    }

    public static void deleteProduct(Product product) {
        productList.remove(product);
        String name = product.getName(product.getIdAndName().keySet().toString());
        String category = product.getCategory().getName();
        String format = String.format("Продукт \"%s\" удален из категории \"%s\".", name, category);
        System.out.println(format);
    }

    public static int getProductAmount() {
        return productList.size();
    }

    public static void printProductAmount() {
        System.out.println("Всего товаров на складе: " + productList.size() + ".");
    }
}
