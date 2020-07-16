package com.app.aprzybysz.model;


import com.app.aprzybysz.generic.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "cinemas")
public class Cinema extends BaseEntity {

    private String name;
    private String address;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "cinema")
    private Set<CinemaRoom> cinemaRooms;


}
