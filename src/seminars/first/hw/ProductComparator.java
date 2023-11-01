package seminars.first.hw;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getCost() > p2.getCost()){
            return 1;
        } else if (p1.getCost() < p2.getCost()) {
            return -1;
        } else {
            return 0;
        }
    }
}
