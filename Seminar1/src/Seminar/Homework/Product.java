package Homework;

public class Product implements Comparable<Product>{
    private Integer cost; // Стоимость продукта
    private String productName; // Название продукта

    public Integer getCost() { // Геттеры, сеттеры:
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public int compareTo(Product product) { //    упорядочиваем объекты, сравнивая их между собой
        return this.getCost().compareTo(product.getCost());
    }
}