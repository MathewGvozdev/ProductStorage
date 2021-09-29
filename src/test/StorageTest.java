package test;

import main.java.com.app.storage.Category;
import main.java.com.app.storage.Product;
import main.java.com.app.storage.Storage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class StorageTest {

    public static void main(String[] args) {

        HashMap<String, String> products = new HashMap<>();
        products.put("156", "Тапки");
        products.put("164", "Сапоги");
        products.put("181", "Кроссовки");
        products.put("202", "Куртка");
        products.put("287", "Байка");
        products.put("230", "Майка");
        products.put("332", "Брюки");
        products.put("325", "Джинсы");
        products.put("379", "Шорты");

        Storage.addCategory(new Category("Обувь"));
        Storage.addCategory(new Category("Верхняя одежда"));
        Storage.addCategory(new Category("Штаны"));

        Storage.addProduct(new Product(Storage.getCategoryList().get(0), products));

        Storage.printCategoryList(Storage.getCategoryList());
        Storage.printProductList(Storage.getProductList());
        Storage.printProductAmount();

        Storage.deleteProduct(Storage.getProductList().get(0));

        Storage.printCategoryList(Storage.getCategoryList());
        Storage.printProductList(Storage.getProductList());
        Storage.printProductAmount();

    }
}
