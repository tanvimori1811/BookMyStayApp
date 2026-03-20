import java.util.*;

public class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();

        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    public boolean isAvailable(String roomType) {
        return roomAvailability.get(roomType) > 0;
    }

    public void reduceRoom(String roomType) {
        roomAvailability.put(roomType,
                roomAvailability.get(roomType) - 1);
    }

    // ✅ REQUIRED FOR UC10
    public void addRoom(String roomType) {
        roomAvailability.put(roomType,
                roomAvailability.get(roomType) + 1);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }
}