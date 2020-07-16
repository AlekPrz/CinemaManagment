package com.app.aprzybysz.controller;


import com.app.aprzybysz.Service.CinemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor

public class CinemaController {


    final private CinemaService cinemaService;




    @PostMapping
    public Long createCinema(){

        return cinemaService.

    }





}
