package commandpattern;

import commandpattern.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    List<Order> orders;

    public Broker(){
        orders = new ArrayList<>();
    }

    public void takeOrder(Order order){
        this.orders.add(order);
    }

    public void placeOrders(){
        for(Order order: orders){
            order.execute();
        }
    }
}
