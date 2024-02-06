package Homework;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Shop {
    private List<Product> products;

    public List<Product> getProducts() {     // Геттеры, сеттеры:
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    
    public List<Product> sortProductsByPrice() { //    метод sortProductsByPrice() сортирует список продуктов по стоимости (по возрастанию)
        Collections.sort(products);
        return products;
    }

    public Product getMostExpensiveProduct() { //    метод getMostExpensiveProduct() возвращает самый дорогой продукт
        return sortProductsByPrice().get(products.size() - 1);
    }

}