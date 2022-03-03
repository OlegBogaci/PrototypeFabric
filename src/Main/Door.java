package Main;

public abstract class Door implements Cloneable{
    protected int weight;

    public Door(int weight){
        this.weight=weight;
    }

    @Override
    public abstract String toString();

    @Override
    public Door clone() throws CloneNotSupportedException {
        Door copy = (Door) super.clone();
        return copy;
    }
}

