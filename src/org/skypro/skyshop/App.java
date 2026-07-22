package org.skypro.skyshop;

import java.util.Arrays;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        SearchEngine searchEngine = new SearchEngine(20);

        Product p1 = new SimpleProduct("Хлеб", 50);
        Product p2 = new SimpleProduct("Молоко", 80);
        Product p3 = new DiscountedProduct("Яблоки", 120, 20); // 120 - 24 = 96
        Product p4 = new FixPriceProduct("Сыр"); // 99
        Product p5 = new DiscountedProduct("Колбаса", 300, 10); // 300 - 30 = 270
        Product p6 = new SimpleProduct("Сок", 150);

        // Добавление продуктов в движок поиска
        searchEngine.add(p1);
        searchEngine.add(p2);
        searchEngine.add(p3);
        searchEngine.add(p4);
        searchEngine.add(p5);
        searchEngine.add(p6);

        // Добавление статей в движок поиска
        Article a1 = new Article("Польза яблок", "Яблоки очень полезны для здоровья.");
        Article a2 = new Article("Как выбрать хлеб", "Хлеб должен быть свежим и ароматным.");
        Article a3 = new Article("Молоко и кальций", "Молоко - отличный источник кальция.");
        searchEngine.add(a1);
        searchEngine.add(a2);
        searchEngine.add(a3);

        // Добавление продукта в корзину
        basket.addProduct(p1);
        basket.addProduct(p2);
        basket.addProduct(p3);
        basket.addProduct(p4);

        // Добавление продукта в заполненную корзину, в которой нет свободного места
        basket.addProduct(p5);
        basket.addProduct(p6); // выведет "Невозможно добавить продукт"

        // Печать содержимого корзины с несколькими товарами
        System.out.println("\nСодержимое корзины:");
        basket.printBasket();

        // Получение стоимости корзины с несколькими товарами
        System.out.println("\nСтоимость корзины: " + basket.getTotalPrice());

        // Поиск товара, который есть в корзине
        System.out.println("\nПоиск 'Молоко': " + basket.containsProduct("Молоко"));

        // Поиск товара, которого нет в корзине
        System.out.println("Поиск 'Сок': " + basket.containsProduct("Сок"));

        // Очистка корзины
        basket.clearBasket();
        System.out.println("\nКорзина очищена.");

        // Печать содержимого пустой корзины
        System.out.println("\nСодержимое пустой корзины:");
        basket.printBasket();

        // Получение стоимости пустой корзины
        System.out.println("\nСтоимость пустой корзины: " + basket.getTotalPrice());

        // Поиск товара по имени в пустой корзине
        System.out.println("\nПоиск 'Хлеб' в пустой корзине: " + basket.containsProduct("Хлеб"));

        // Демонстрация функциональности поиска (через SearchEngine)
        System.out.println("\n--- Демонстрация поиска ---");
        System.out.println("Поиск 'Яблок':");
        printSearchResults(searchEngine.search("Яблок"));

        System.out.println("Поиск 'Хлеб':");
        printSearchResults(searchEngine.search("Хлеб"));

        System.out.println("Поиск 'Молоко':");
        System.out.println(Arrays.toString(searchEngine.search("Молоко")));
    }

    private static void printSearchResults(Searchable[] results) {
        for (Searchable s : results) {
            if (s != null) {
                System.out.println(s.getStringRepresentation());
            }
        }
    }
}
