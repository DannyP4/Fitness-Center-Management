package com.example.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "rooms")
public class Room extends BaseModel {

    @Column(name = "room_name")
    private String roomName;

    @Enumerated(EnumType.STRING)
    @Column(name = "room_type")
    private RoomType type;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private RoomStatus status;

    @OneToMany(mappedBy = "room")
    private List<Equipment> equipmentList;
}

