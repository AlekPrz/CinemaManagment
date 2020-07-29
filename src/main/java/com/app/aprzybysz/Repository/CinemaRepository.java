package com.app.aprzybysz.Repository;

import com.app.aprzybysz.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
