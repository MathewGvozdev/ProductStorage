package test;

import main.java.com.app.storage.Category;
import main.java.com.app.storage.Product;
import main.java.com.app.storage.Storage;

public class StorageTest {

    public static void main(String[] args) {
        Storage storage = Storage.getStorage();

        Category category1 = new Category("Обувь");
        Category category2 = new Category("Верхняя одежда");
        Category category3 = new Category("Штаны");

        Product product1 = new Product(category1, 155, "Тапки");
        Product product2 = new Product(category1, 164, "Сапоги");
        Product product3 = new Product(category1, 181, "Кроссовки");

        Product product4 = new Product(category2, 202, "Куртка");
        Product product5 = new Product(category2, 287, "Байка");
        Product product6 = new Product(category2, 230, "Майка");

        Product product7 = new Product(category3, 332, "Брюки");
        Product product8 = new Product(category3, 325, "Джинсы");
        Product product9 = new Product(category3, 379, "Шорты");

        storage.addCategory(category1);
        storage.addCategory(category2);
        storage.addCategory(category3);

        storage.addProduct(product1);
        storage.addProduct(product2);
        storage.addProduct(product3);
        storage.addProduct(product4);
        storage.addProduct(product5);
        storage.addProduct(product6);
        storage.addProduct(product7);
        storage.addProduct(product8);
        storage.addProduct(product9);

        storage.printCategoryList(storage.getCategoryList());
        storage.printProductList(storage.getProductList());
        storage.printProductAmount();

        storage.deleteProduct(product1);

        storage.printCategoryList(storage.getCategoryList());
        storage.printProductList(storage.getProductList());
        storage.printProductAmount();
    }
}
