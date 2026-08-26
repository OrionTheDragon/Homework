package org.skypro.skyshop;

import java.util.List;
import java.util.Set;
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
        SearchEngine searchEngine = new SearchEngine();

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
        basket.addProduct(p5);
        basket.addProduct(p6); // Теперь нет ограничений на размер корзины
        basket.addProduct(new SimpleProduct("Молоко", 85)); // Добавим ещё одно молоко для проверки удаления дубликатов

        // Печать содержимого корзины с несколькими товарами
        System.out.println("\nСодержимое корзины:");
        basket.printBasket();

        // Удалить существующий продукт из корзины.
        System.out.println("\nУдаление 'Молоко' из корзины:");
        List<Product> removedMilk = basket.removeProductByName("Молоко");
        System.out.println("Удаленные продукты:");
        for (Product p : removedMilk) {
            System.out.println(p);
        }

        // Вывести содержимое корзины
        System.out.println("\nСодержимое корзины после удаления 'Молоко':");
        basket.printBasket();

        // Удалить несуществующий продукт.
        System.out.println("\nУдаление 'Неизвестный' из корзины:");
        List<Product> removedUnknown = basket.removeProductByName("Неизвестный");
        if (removedUnknown.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Удаленные продукты:");
            for (Product p : removedUnknown) {
                System.out.println(p);
            }
        }

        // Вывести содержимое корзины на экран.
        System.out.println("\nСодержимое корзины после удаления несуществующего продукта:");
        basket.printBasket();

        // Демонстрация функциональности поиска (через SearchEngine)
        System.out.println("\n--- Демонстрация поиска ---");
        System.out.println("Поиск 'Яблок':");
        printSearchResults(searchEngine.search("Яблок"));

        System.out.println("Поиск 'Хлеб':");
        printSearchResults(searchEngine.search("Хлеб"));

        System.out.println("Поиск 'Молоко':");
        printSearchResults(searchEngine.search("Молоко"));

        System.out.println("\n--- Демонстрация ошибок создания объектов ---");
        try {
            new SimpleProduct("   ", 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания продукта с пустым именем: " + e.getMessage());
        }

        try {
            new SimpleProduct("Тест", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания продукта с отрицательной ценой: " + e.getMessage());
        }

        try {
            new DiscountedProduct("Тест скидки", 100, 150);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания продукта с неверной скидкой: " + e.getMessage());
        }

        try {
            new Article("Тест", null);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания статьи с пустым текстом: " + e.getMessage());
        }

        System.out.println("\n--- Демонстрация поиска наиболее подходящего элемента ---");
        try {
            Searchable bestResult = searchEngine.findBestMatch("Яблок");
            System.out.println("Лучший результат для 'Яблок': " + bestResult.getName());
        } catch (org.skypro.skyshop.exceptions.BestResultNotFound e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }

        try {
            Searchable bestResult = searchEngine.findBestMatch("Апельсин");
            System.out.println("Лучший результат для 'Апельсин': " + bestResult.getName());
        } catch (org.skypro.skyshop.exceptions.BestResultNotFound e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }
    }

    private static void printSearchResults(Set<Searchable> results) {
        for (Searchable s : results) {
            System.out.println(s.getStringRepresentation());
        }
    }
}
