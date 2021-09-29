package test;

import main.java.com.app.storage.Category;
import main.java.com.app.storage.Product;
import main.java.com.app.storage.Storage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StorageTest {

    public static void main(String[] args) {
        System.out.println("Выберете действие: ");
        System.out.println("1. Добавление новой категории");
        System.out.println("2. Добавление нового товара в категорию");
        System.out.println("3. Удаление товара из категории");
        System.out.println("4. Просмотр списка категорий");
        System.out.println("5. Просмотр списка всех продуктов");
        System.out.println("6. Количество товаров");
        System.out.println("7. Выход");
        Storage storage = Storage.getStorage();
        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader reader = new BufferedReader(input)) {
            String request;
            while (!(request = reader.readLine()).equals("7")) {
                switch (request) {
                    case "1" -> {
                        System.out.print("Введите имя новой категории: ");
                        String categoryName = reader.readLine();
                        storage.addCategory(new Category(categoryName));
                    }
                    case "2" -> {
                        System.out.print("Введите категорию товара: ");
                        String productCategory = reader.readLine();
                        System.out.print("Введите id товара: ");
                        String productId = reader.readLine();
                        System.out.print("Введите имя товара: ");
                        String productName = reader.readLine();
                        for (Category category : storage.getCategoryList()) {
                            if (category.getName().equals(productCategory)) {
                                storage.addProduct(new Product(category, productId, productName));
                            }
                        }
                    }
                    case "3" -> {
                        System.out.print("Введите товар, который хотите удалить: ");
                        String removalProduct = reader.readLine();
                        for (Product product : storage.getProductList()) {
                            if (product.getName().equals(removalProduct) || product.getId().equals(removalProduct)) {
                                storage.deleteProduct(product);
                            }
                        }
                    }
                    case "4" -> storage.printCategoryList(storage.getCategoryList());
                    case "5" -> storage.printProductList(storage.getProductList());
                    case "6" -> storage.printProductAmount();
                    default -> System.out.println("Неизвестная операция.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


//        Storage storage = Storage.getStorage();
//
//        Category category1 = new Category("Обувь");
//        Category category2 = new Category("Верхняя одежда");
//        Category category3 = new Category("Штаны");
//
//        Product product1 = new Product(category1, 155, "Тапки");
//        Product product2 = new Product(category1, 164, "Сапоги");
//        Product product3 = new Product(category1, 181, "Кроссовки");
//
//        Product product4 = new Product(category2, 202, "Куртка");
//        Product product5 = new Product(category2, 287, "Байка");
//        Product product6 = new Product(category2, 230, "Майка");
//
//        Product product7 = new Product(category3, 332, "Брюки");
//        Product product8 = new Product(category3, 325, "Джинсы");
//        Product product9 = new Product(category3, 379, "Шорты");
//
//        storage.addCategory(category1);
//        storage.addCategory(category2);
//        storage.addCategory(category3);
//
//        storage.addProduct(product1);
//        storage.addProduct(product2);
//        storage.addProduct(product3);
//        storage.addProduct(product4);
//        storage.addProduct(product5);
//        storage.addProduct(product6);
//        storage.addProduct(product7);
//        storage.addProduct(product8);
//        storage.addProduct(product9);
//
//        storage.printCategoryList(storage.getCategoryList());
//        storage.printProductList(storage.getProductList());
//        storage.printProductAmount();
//
//        storage.deleteProduct(product1);
//
//        storage.printCategoryList(storage.getCategoryList());
//        storage.printProductList(storage.getProductList());
//        storage.printProductAmount();
    }
}
