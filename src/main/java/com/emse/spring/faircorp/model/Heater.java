package com.emse.spring.faircorp.model;

import javax.persistence.*;

@Entity
@Table(name = "HEATER")
public class Heater {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private Long power;

    @ManyToOne
    private Room room;

    @Enumerated(EnumType.STRING)
    private HeaterStatus heaterStatus;

    public Heater() {
    }

    public Heater(String name, HeaterStatus heaterStatus, Long power, Room room) {
        this.heaterStatus = heaterStatus;
        this.name = name;
        this.power = power;
        this.room = room;
    }

    public Long getId() {
        return this.id;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(String name) {
        this.power = power;
    }

    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStatus(HeaterStatus heaterStatus) {
        this.heaterStatus = heaterStatus;
    }
}