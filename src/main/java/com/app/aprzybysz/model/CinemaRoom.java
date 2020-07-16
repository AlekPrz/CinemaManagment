package com.app.aprzybysz.model;


import com.app.aprzybysz.generic.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "cinema_rooms")
public class CinemaRoom extends BaseEntity {

    @Column(name = "cinema_room_rows")
    private Integer rows;

    @Column(name = "cinema_room_places")
    private Integer places;

    private Boolean threeD;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToMany(mappedBy = "cinemaRoom")
    private Set<Seat> seats;

    @OneToMany(mappedBy = "cinemaRoom")
    private Set<Seance> seances;

}
