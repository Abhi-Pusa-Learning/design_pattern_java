package commandpattern;

public class Stock {
    private String name;
    private Integer price;
    public Stock(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public void buy(){
        System.out.println("Buy Stock, name: "+name+", price: " + price);
    }

    public void sell(){
        System.out.println("Sell stock, name: "+name+", price: "+price);
    }
}
