package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShopRepositoryTest {
    @Test
    public void testRemove() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "телефон", 30_000);
        Product product2 = new Product(2, "книга", 300);
        Product product3 = new Product(3, "машина", 3_000_000);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(2);

        Product[] actual = repo.findAll();
        Product[] expected = {product1, product3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemove1() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "телефон", 30_000);
        Product product2 = new Product(2, "книга", 300);
        Product product3 = new Product(3, "машина", 3_000_000);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        ;

        Product[] actual = repo.findAll();
        Product[] expected = {product1, product2, product3};

        Assertions.assertThrows(
                NotFoundException.class,
                () -> repo.remove(2555));
    }
}
