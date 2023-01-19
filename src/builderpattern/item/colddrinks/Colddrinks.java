package builderpattern.item.colddrinks;

import builderpattern.item.Item;
import builderpattern.packing.Bottle;
import builderpattern.packing.Packing;

public abstract class Colddrinks implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
