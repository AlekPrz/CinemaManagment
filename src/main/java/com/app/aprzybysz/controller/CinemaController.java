package com.app.aprzybysz.controller;


import com.app.aprzybysz.Service.CinemaService;
import com.app.aprzybysz.dto.CinemaDto;
import com.app.aprzybysz.model.Cinema;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/p")
@RequiredArgsConstructor

public class CinemaController {


    final private CinemaService cinemaService;


    @GetMapping("/test")
    public String xD() {
        return "HII";
    }

    @PostMapping
    public Cinema createCinema(@RequestBody CinemaDto cinemaDto) {

        return cinemaService.createCinemaDto(cinemaDto);

    }

    @GetMapping
    public String getCienemas() {

        return "XD";

    }


}
