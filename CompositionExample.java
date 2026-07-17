class Room {
    private String roomType;

    Room(String roomType) {
        this.roomType = roomType;
    }

    void diplayRoom() {
        System.out.println("Room Type: " + roomType);
    }
}

class House {
    private String houseName;
    private Room room;

    House(String houseString, String roomType) {
        this.houseName = houseName;
        room = new Room(roomType);
    }

    void displayHouse() {
        System.out.println("House name: " + houseName);
        room.diplayRoom();
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        House house = new House("Geen Villa", "Bedroom");
        house.displayHouse();
    }
}
