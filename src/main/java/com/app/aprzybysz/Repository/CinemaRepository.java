package com.app.aprzybysz.Repository;

import com.app.aprzybysz.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
