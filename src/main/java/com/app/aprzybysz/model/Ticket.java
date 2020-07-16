package com.app.aprzybysz.model;


import com.app.aprzybysz.generic.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "tickets")
public class Ticket extends BaseEntity {

    private BigDecimal price;
    private BigDecimal discount;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "seance_id")
    private Seance seance;


}
