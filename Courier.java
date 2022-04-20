package Shop;

public class Courier implements Delivery{
    String courier;
    String adressDelivery;

    @Override
    public void addDelivery(String courier, String adress) {
        Courier courier1 = new Courier();
        courier1.adressDelivery = adress;
        courier1.courier = courier;
    }
}
