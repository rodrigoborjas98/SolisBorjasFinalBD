package com.mycompany.cesar;

import java.util.Objects;

public class Classroom {
    private String building;
    private int room_number;
    private int capacity;

    public Classroom(String building, int room_number, int capacity) {
        this.building = building;
        this.room_number = room_number;
        this.capacity = capacity;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

   @Override
    public String toString() {
        return "Classroom{" + "building=" + building + ", room_number=" + room_number + ", capacity=" + capacity + '}';
    }
}
