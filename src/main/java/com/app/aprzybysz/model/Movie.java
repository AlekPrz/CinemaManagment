package com.app.aprzybysz.model;

import com.app.aprzybysz.model.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "movies")
public class Movie {
   @Id
    @GeneratedValue
    private Long id;

    private String name;
    private LocalDate releaseDate;
    private Double rating;
    private String info;
    private Boolean threeD;

    @ElementCollection
    @CollectionTable(name = "type", joinColumns = @JoinColumn(name = "movie_id"))
    private List<Type> types;

    @OneToMany(mappedBy = "movie")
    Set<Seance> seances;


}
