package commandpattern;

import commandpattern.order.BuyStock;
import commandpattern.order.Order;
import commandpattern.order.SellStock;

public class CommandPatternDemo {
    public void execute(){
        Stock abcStock = new Stock("abcStock",10);
        Order buyStock = new BuyStock(abcStock);
        Order sellStock = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
