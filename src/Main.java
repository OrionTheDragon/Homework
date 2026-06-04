import java.util.Arrays;
import java.util.Objects;

class Product {
    int id;
    String name;
    int price;
    String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Товар[артикул=" + id + ", название=" + name + ", цена=" + price + ", категория=" + category + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(category, product.category);
    }
}

class Order {
    String customer;
    Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Order[customer=" + customer + ", basket=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;

        if (!Objects.equals(customer, order.customer)) {
            return false;
        }

        if (basket == order.basket) return true;
        if (basket == null || order.basket == null) return false;
        if (basket.length != order.basket.length) return false;

        boolean arraysEqual = true;
        for (int i = 0; i < basket.length; i++) {
            Product product1 = basket[i];
            Product product2 = order.basket[i];

            if (product1 == null && product2 == null) {
                continue;
            }

            if (product1 == null || product2 == null || !product1.equals(product2)) {
                arraysEqual = false;
                break;
            }
        }

        return arraysEqual;
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Смартфон", 50000, "Электроника");
        Product p2 = new Product(101, "Телефон", 45000, "Электроника");
        Product p3 = new Product(102, "Ноутбук", 80000, "Компьютеры");
        Product p4 = new Product(103, "Планшет", 30000, null);
        Product p5 = new Product(103, "Планшет V2", 35000, null);

        System.out.println("--- Товары ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println("\n--- Сравнение товаров ---");
        System.out.println("p1 equals p2 (одинаковый id и category): " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));
        System.out.println("p4 equals p5 (оба category null, одинаковый id): " + p4.equals(p5));

        // Тестирование класса Order
        Product[] basket1 = {p1, p3};
        Product[] basket2 = {p2, p3}; // p1 и p2 равны по equals
        Product[] basket3 = {p1, p4};

        Order order1 = new Order("Иван Иванов", basket1);
        Order order2 = new Order("Иван Иванов", basket2);
        Order order3 = new Order("Петр Петров", basket1);
        Order order4 = new Order("Иван Иванов", basket3);

        System.out.println("\n--- Заказы ---");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);

        System.out.println("\n--- Сравнение заказов ---");
        System.out.println("order1 equals order2 (одинаковый покупатель, товары равны по equals): " + order1.equals(order2));
        System.out.println("order1 equals order3 (разные покупатели): " + order1.equals(order3));
        System.out.println("order1 equals order4 (разные корзины): " + order1.equals(order4));
    }
}
