package prototypepattern.shape;

public abstract class Shape implements Cloneable{
    private Integer id;
    protected String type;
    abstract void draw();
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getType(){
        return type;
    }
    public Shape clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException exception){
            System.out.println("Object cloning is not supported");
        }
        return (Shape) clone;
    }
}
