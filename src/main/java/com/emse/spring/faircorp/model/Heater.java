package com.emse.spring.faircorp.model;

import javax.persistence.*;

@Entity// (1)
@Table(name = "HEATER")// (2)
public class Heater {
    @Id// (3)
    @GeneratedValue
    private Long id;

    // (4)
    @Column(nullable=false)
    private String name;

    @Column(nullable=true)
    private String power;

    @ManyToOne
    private Room room;

    @Enumerated(EnumType.STRING)// (5)
    private HeaterStatus heaterStatus;

    public Heater() {
    }

    public Heater(String name, HeaterStatus status, String power, Room room) {
        this.heaterStatus = status;
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

    public void setPower(String name) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStatus(HeaterStatus heaterStatus) {
        this.heaterStatus = heaterStatus;
    }
}