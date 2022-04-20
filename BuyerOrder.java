package Shop;

import java.util.ArrayList;
import java.util.List;

public class BuyerOrder implements Order {
    private List<Product> buyerOrder = new ArrayList<Product>();
    @Override
    public void order(Product product) {
                 buyerOrder.add(product);
            }

    @Override
    public void printOrder(){
        System.out.println(buyerOrder.toString());
    }
}
