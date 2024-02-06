package Homework;

import java.util.*;
import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    public static void main(String[] args) {
            /*
    1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
    2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct (магазин возвращает верный самый дорогой продукт).
    3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (магазин возвращает верный отсортированный по цене список продуктов).
   */
        Shop testShop = new Shop();
        testShop.setProducts(getShuffleListProducts(getTestListProducts()));

        assertThat(testShop.getProducts()).hasSize(4); // проверяем утверждение, что магазин хранит верное количество продуктов

        assertThat(testShop.getMostExpensiveProduct().getProductName()).isEqualTo(getTestListProducts().get(3) // проверяем утверждение, что магазин возвращает самый дорогой продукт
                .getProductName());

        assertThat(testShop.sortProductsByPrice().get(0).getCost()).isEqualTo(200); // проверяем утверждения, что магазин верно сортирует список продуктов
        assertThat(testShop.sortProductsByPrice().get(1).getCost()).isEqualTo(80);
        assertThat(testShop.sortProductsByPrice().get(2).getCost()).isEqualTo(299);
        assertThat(testShop.sortProductsByPrice().get(3).getCost()).isEqualTo(600);

    }

//    метод для создания списка продуктов
    static List<Product> getTestListProducts() {

        Product productA = new Product();
        productA.setProductName("сыр");
        productA.setCost(200);

        Product productB = new Product();
        productB.setProductName("хлеб");
        productB.setCost(80);

        Product productC = new Product();
        productC.setProductName("чай");
        productC.setCost(299);

        Product productD = new Product();
        productD.setProductName("колбаса");
        productD.setCost(600);

        List<Product> productList = new ArrayList<>();

        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);

        return productList;
    }

    static List<Product> getShuffleListProducts(List<Product> productList) { //    метод перемешивает продукты в нашем списке
        Collections.shuffle(productList);
        return productList;
    }

}




