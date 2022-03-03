package Main;

public class DoorFactory {
    Door door;

    void setDoor(Door door){
        this.door=door;
    }

    public DoorFactory(Door door){
        this.door=door;
    }

    public Door makeDoor() throws CloneNotSupportedException {
        System.out.println(door.toString()+" Was made by Factory");
        return this.door.clone();

    }
}
