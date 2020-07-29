package com.app.aprzybysz.Service;

import com.app.aprzybysz.Repository.CinemaRepository;
import com.app.aprzybysz.dto.CinemaDto;
import com.app.aprzybysz.mapper.Mappers;
import com.app.aprzybysz.model.Cinema;
import com.app.aprzybysz.validator.generic.CreateCinemaValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CinemaService {
    private final CinemaRepository cinemaRepository;

    public Cinema createCinemaDto(CinemaDto cinemaDto) {


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

        var cinema = Optional.of(Mappers.fromCinemaDtoToCinema(cinemaDto));

        cinemaRepository.save(cinema.orElseThrow(() -> new RuntimeException("Cinema couldn't be saved")));


        return cinema.get();


    }
}
