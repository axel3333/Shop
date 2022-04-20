package Shop;

public class PickUp implements Delivery{
    String nameMagazine;
    String pickUpAdress;

    @Override
    public void addDelivery(String courier, String adress) {
        PickUp pickUp = new PickUp();
        pickUp.nameMagazine = courier;
        pickUp.pickUpAdress = adress;
    }
}
