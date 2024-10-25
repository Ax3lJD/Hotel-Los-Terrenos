package com.vpalz.hotellosterrenos.DAO;

import com.vpalz.hotellosterrenos.entity.Floor;

import java.util.HashMap;
import java.util.Map;

public class FloorDAO {
    private final Map<Integer, Floor> floorData = new HashMap<>(); // Temporary storage

    public Floor getFloorByNumber(int floorNumber) {
        return floorData.get(floorNumber);
    }

    public void saveFloor(Floor floor) {
        floorData.put(floor.getFloorNumber(), floor);
    }

    public void deleteFloor(int floorNumber) {
        floorData.remove(floorNumber);
    }
}
