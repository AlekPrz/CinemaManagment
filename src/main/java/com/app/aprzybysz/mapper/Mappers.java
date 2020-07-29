package com.app.aprzybysz.mapper;


import com.app.aprzybysz.dto.CinemaDto;
import com.app.aprzybysz.model.Cinema;

public interface Mappers {


    static CinemaDto fromCinemaToCinemaDto(Cinema cinema) {

        return CinemaDto
                .builder()
                .name(cinema.getName())
                .address(cinema.getAddress())
                .city(cinema.getCity())
                .build();
    }

    static Cinema fromCinemaDtoToCinema(CinemaDto cinemaDto) {

        return Cinema.builder()
                .name(cinemaDto.getName())
                .address(cinemaDto.getAddress())
                .city(cinemaDto.getCity())
                .build();
    }


}
