package seminars.first.hw;

import java.util.ArrayList;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    public static void main(String[] args) {
    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */

        Shop shop = new Shop();
        Product product = new Product();
        product.setCost(110);
        product.setTitle("apple");
        Product product2 = new Product();
        product2.setCost(170);
        product2.setTitle("orange");
        Product product3 = new Product();
        product3.setCost(70);
        product3.setTitle("water");
        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);
        shop.setProducts(products);


        assertThat(shop.getProducts().size()).isEqualTo(3);
        assertThat (shop.getProducts().get(0).getTitle()).isEqualTo("apple");
        assertThat (shop.getProducts().get(1).getTitle()).isEqualTo("orange");
        assertThat (shop.getProducts().get(2).getTitle()).isEqualTo("water");
        assertThat(shop.getProducts().containsAll(products)).isTrue();
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(170);
        assertThat(shop.getSortedListProducts().get(0).getTitle()).isEqualTo("water");
        assertThat(shop.getSortedListProducts().get(1).getTitle()).isEqualTo("apple");
        assertThat(shop.getSortedListProducts().get(2).getTitle()).isEqualTo("orange");
        int min = 0;
        for (Product p: shop.getSortedListProducts()) {
            assertThat(p.getCost() >= min).isTrue();
            min = p.getCost();
        }
    }

}




