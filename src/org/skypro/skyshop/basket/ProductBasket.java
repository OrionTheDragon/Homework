package org.skypro.skyshop.basket;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Map<String, List<Product>> products = new HashMap<>();

    public void addProduct(Product product) {
        products.computeIfAbsent(product.getName(), name -> new LinkedList<>()).add(product);
    }

    public int getTotalPrice() {
        int total = 0;
        for (List<Product> productsByName : products.values()) {
            for (Product product : productsByName) {
                total += product.getPrice();
            }
        }
        return total;
    }

    public void printBasket() {
        if (products.isEmpty()) {
            System.out.println("в корзине пусто");
            return;
        }
        int specialCount = 0;
        for (List<Product> productsByName : products.values()) {
            for (Product product : productsByName) {
                System.out.println(product.toString());
                if (product.isSpecial()) {
                    specialCount++;
                }
            }
        }
        System.out.println("Итого: " + getTotalPrice());
        System.out.println("Специальных товаров: " + specialCount);
    }

    public boolean containsProduct(String name) {
        List<Product> productsByName = products.get(name);
        if (productsByName == null) {
            return false;
        }
        for (Product product : productsByName) {
            if (product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        products.clear();
    }

    public List<Product> removeProductByName(String name) {
        List<Product> removedProducts = products.remove(name);
        return removedProducts == null ? new LinkedList<>() : removedProducts;
    }
}
