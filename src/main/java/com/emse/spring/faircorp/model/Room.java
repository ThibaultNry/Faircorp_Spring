package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer floor;

    @Column
    private Double currentTemperature;

    @Column
    private Double targetTemperature;

    @OneToMany(mappedBy = "room")
    private List<Heater> heaters;

    @OneToMany(mappedBy = "room")
    private List<Window> windows;

    @ManyToOne
    private Building building;

    public Room() {
    }

    public Room(String name, int floor, Double currentTemperature, Double targetTemperature, Building building) {
        this.name = name;
        this.floor = floor;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.building = building;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(String name) {
        this.floor = floor;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(String name) {
        this.currentTemperature = currentTemperature;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(String name) {
        this.targetTemperature = targetTemperature;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public List<Heater> getHeaters() {
        return heaters;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

}