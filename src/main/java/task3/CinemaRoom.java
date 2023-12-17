package task3;

class CinemaRoom {
    private String roomName;
    private String roomType;

    public CinemaRoom(String roomName, String roomType) {
        this.roomName = roomName;
        this.roomType = roomType;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomType() {
        return roomType;
    }
}