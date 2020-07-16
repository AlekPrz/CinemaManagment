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
@Table(name = "cities")
public class City extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "city")
    private Set<Cinema> cinemas;
}
