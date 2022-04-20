package Shop;
import java.util.Scanner;

public class Main {
    final static int PASSWORD = 113;

    public static void main(String[] args) {
        Shop shop = new Shop();
        Order order = new BuyerOrder();
        shop.addNewProduct(new Product(10,"Хлеб", 40));
        shop.addNewProduct(new Product(20,"Молоко", 70));
        shop.addNewProduct(new Product(30,"Сметана", 65));
        shop.addNewProduct(new Product(40,"Колбаса", 120));
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите номер необходимого действия и нажмите Enter");
        System.out.println("1. Покупатель");
        System.out.println("2. Администратор");
        System.out.println("3. Доставка");
        int input = scan.nextInt();
        if (input == 1) {
            System.out.println("Добро пожаловать!");
            shop.print();
            while(true) {
                System.out.println("Введите номер товара для добавления в заказ или введите \"0\" для выхода");
                int input1 = scan.nextInt();
                if (input1 == 0) {
                    System.out.println("Заказ оформлен");
                    break;
                } else {
                    order.order(shop.getProduct(input1));
                }
                order.printOrder();
            }
            order.printOrder();
        } else if(input == 2) {
            System.out.println("Введите пароль и нажмите Enter");
            int password = scan.nextInt();
            if (PASSWORD == password) {
                System.out.println("Пароль правильный!");
               }else System.out.println("Неверный пароль!");
        } else if(input == 3) {
            System.out.println("1. Доставка");
            System.out.println("2. Самовывоз");
            int delivery = scan.nextInt();
            if (delivery == 1){
                Courier courier = new Courier();
                courier.addDelivery("Иванов","Домой");
                System.out.println("Доставка оформлена!");
            } else if(delivery == 2) {
                PickUp pickUp = new PickUp();
                pickUp.addDelivery("Магазин №1","Пункт самовывоза");
                System.out.println("Самовывоз оформлен!");
            }
        }
    }
}




