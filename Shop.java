package Shop;


import java.util.*;

public class Shop {
    private List<Product> assortiment = new ArrayList<Product>();

    public void addNewProduct(Product product) {
        assortiment.add(product);
    }
//
//    public void removeProduct(Product product) {
//        assortiment.remove(product);
//    }

    public Product getProduct(int id) {
        return assortiment.get(id);
    }


    public void print() {
        for (int i = 0; i < assortiment.size(); i++) {
            Product product = assortiment.get(i);
            System.out.println((i + 1)+ ". " + product.toString());
        }

    }
}
