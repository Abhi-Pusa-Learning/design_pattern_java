package builderpattern.item.colddrinks;

public class CocaCola extends Colddrinks{
    @Override
    public String name() {
        return "Coca Cola";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
