package com.app.aprzybysz.model;


import com.app.aprzybysz.generic.BaseEntity;
import com.app.aprzybysz.model.enums.SeatStatus;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "seats")
public class Seat extends BaseEntity {

    @Column(name = "seat_place")
    private Integer place;

    @Column(name = "seat_row")
    private Integer row;

    @Enumerated(EnumType.STRING)
    private SeatStatus status;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cinema_room_id")
    private CinemaRoom cinemaRoom;
}
