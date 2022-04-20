package Shop;

public class Product {

    private int id;
    private String nameProduct;
    private int price;

    public Product (int id, String nameProduct, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int setID(int id) {
        return this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String setNameProduct(String nameProduct) {
        return this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        return this.price = price;
    }

    @Override
    public String toString() {
        return "Артикул= " + id + ". " + nameProduct +
                ", Цена=" + price + "руб/шт;";
    }


}
