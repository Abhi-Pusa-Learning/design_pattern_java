package builderpattern.item.berger;

import builderpattern.item.Item;
import builderpattern.packing.Packing;
import builderpattern.packing.Wrapper;

public abstract class Berger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
