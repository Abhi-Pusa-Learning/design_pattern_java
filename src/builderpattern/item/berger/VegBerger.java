package builderpattern.item.berger;

public class VegBerger extends Berger{

    @Override
    public String name() {
        return "Veg Berger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
