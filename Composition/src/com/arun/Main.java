package com.arun;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("200B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1400));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44" );
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }


    // Create a single room of a house using composition
    //  Think about the things that would be included in the room
    // Maybe physical parts of the house but furniture as well
    // Add at least one method to acess an object via a getter and
    // add at least one method to hide the object
    // but to access the object used in composition within the main class


    Wall wall1 = new Wall("West");
    Wall wall2 = new Wall("East");
    Wall wall3 = new Wall("South");
    Wall wall4 = new Wall("North");

    Ceiling ceiling = new Ceiling(12, 55);
    Bed bed = new Bed("Modern", 4, 3, 2, 11);
    Lamp lamp = new Lamp("Classic", false, 75);

    Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
    bedRoom.makeBed();
    bedRoom.getLamp().turnOn();




}
