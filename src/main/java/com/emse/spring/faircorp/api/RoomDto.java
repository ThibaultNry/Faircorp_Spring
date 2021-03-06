package com.emse.spring.faircorp.api;

import java.util.List;

import com.emse.spring.faircorp.model.Room;

public class RoomDto {
    private Long id;
    private Double currentTemperature;
    private Integer floor;
    private String name;
    private Double targetTemperature;
    Long buildingId;
    private List<WindowDto> windows;
    private List<HeaterDto> heaters;

    public RoomDto() {
    }

    public RoomDto(Room room) {
        this.id = room.getId();
        this.currentTemperature = room.getCurrentTemperature();
        this.floor = room.getFloor();
        this.name = room.getName();
        this.targetTemperature = room.getTargetTemperature();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public List<WindowDto> getWindows() {
        return windows;
    }

    public void setWindows(List<WindowDto> windows) {
        this.windows = windows;
    }

    public List<HeaterDto> getHeaters() {
        return heaters;
    }

    public void setHeaters(List<HeaterDto> heaters) {
        this.heaters = heaters;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

}
