package com.app.aprzybysz.Service;

import com.app.aprzybysz.Repository.CinemaRepository;
import com.app.aprzybysz.dto.CinemaDto;
import com.app.aprzybysz.validator.generic.CreateCinemaValidator;
import lombok.RequiredArgsConstructor;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class CinemaService {
    private final CinemaRepository cinemaRepository;

    public Long createCinemaDto(CinemaDto cinemaDto) {


        var createCinemaValidator = new CreateCinemaValidator();
        var errors = createCinemaValidator.validate(cinemaDto);

        if (createCinemaValidator.hasErrors()) {
            var errorsMessage = errors
                    .entrySet()
                    .stream()
                    .map(e -> e.getKey() + ": " + e.getValue())
                    .collect(Collectors.joining(", "));
            throw new RuntimeException("Create product validation errors: " + errorsMessage);
        }


        return cinemaRepository.save(cinemaDto);

    }
}
