package builderpattern.item;

import builderpattern.packing.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
