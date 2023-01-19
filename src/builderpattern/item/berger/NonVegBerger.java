package builderpattern.item.berger;

public class NonVegBerger extends Berger{

    @Override
    public String name() {
        return "Non Veg Berger";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
