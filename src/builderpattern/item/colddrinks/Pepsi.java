package builderpattern.item.colddrinks;

public class Pepsi extends Colddrinks{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
