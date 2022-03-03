package Main;

public class MetalDoor extends Door{
    public MetalDoor(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "MetalDoor{" +
                "weight=" + weight +
                '}';
    }

}
