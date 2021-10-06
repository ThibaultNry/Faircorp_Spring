package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.Set;

@Entity// (1)
@Table(name = "ROOM")// (2)
public class Room {
    @Id// (3)
    @GeneratedValue
    private Long id;

    // (4)
    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private Integer floor;

    @Column
    private Double currentTemperature;

    @Column
    private Double targetTemperature;

    @OneToMany(mappedBy = "room")
    private Set<Heater> heaters;

    @OneToMany(mappedBy = "room")
    private Set<Window> windows;

    public Room() {
    }

    public Room(String name, int floor, Double currentTemperature, Double targetTemperature) {
        this.name = name;
        this.floor = floor;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
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

}