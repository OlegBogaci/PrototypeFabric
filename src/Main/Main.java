package Main;
//Prototype and Fabric Patterns
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Door tempDoor;

        Door prot = new WoodenDoor(10);
        DoorFactory doorFactory = new DoorFactory(prot);

        for (int i = 0; i < 10; i++) {
            tempDoor = doorFactory.makeDoor(); //unique doors are made
        }

        Door prot1 = new MetalDoor(50);
        doorFactory.setDoor(prot1);
        doorFactory.makeDoor();

        Door copy = prot.clone();
        System.out.println( copy.toString());
    }
}
