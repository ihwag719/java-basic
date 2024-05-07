package class1.ex;

import java.util.MissingFormatArgumentException;

public class ProductOrderMain {
    public static void main(String[] args) {
        int total = 0;
        
        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        ProductOrder[] productOrders = {dubu, kimchi, cola};

        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
            total += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액: " + total);
    }

}
