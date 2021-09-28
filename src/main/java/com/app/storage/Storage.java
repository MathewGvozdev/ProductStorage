package main.java.com.app.storage;

import java.util.ArrayList;

public class Storage {

    private ArrayList<Category> categoryList = new ArrayList<>();
    private ArrayList<Product> productList = new ArrayList<>();

    public void addCategory(Category category) {
        categoryList.add(category);
        String name = category.getName();
        String format = String.format("Добавлена категория \"%s\".", name);
        System.out.println(format);
    }

    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public void printCategoryList(ArrayList<Category> list) {
        System.out.println("Список категорий: ");
        for (Category category : list) {
            System.out.println((list.indexOf(category) + 1) + ". " + category.getName());
        }
    }

    public void addProduct(Product product) {
        productList.add(product);
        String name = product.getName();
        String category = product.getCategory().getName();
        String format = String.format("Продукт \"%s\" добавлен в категорию \"%s\".", name, category);
        System.out.println(format);
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void printProductList(ArrayList<Product> list) {
        System.out.println("Список продуктов: ");
        for (Product product : list) {
            System.out.println((list.indexOf(product) + 1) + ". " + product.getName());
        }
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
        String name = product.getName();
        String category = product.getCategory().getName();
        String format = String.format("Продукт \"%s\" удален из категории \"%s\".", name, category);
        System.out.println(format);
    }

    public int getProductAmount() {
        return productList.size();
    }

    public void printProductAmount() {
        System.out.println("Всего товаров на складе: " + productList.size() + ".");
    }
}
