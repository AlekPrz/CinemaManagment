package com.app.aprzybysz.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "seances")
public class Seance {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @OneToMany(mappedBy = "seance")
    private Set<Ticket> tickets;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "cinema_room_id")
    private CinemaRoom cinemaRoom;


}
