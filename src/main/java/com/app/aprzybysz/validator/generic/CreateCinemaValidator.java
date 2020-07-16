package com.app.aprzybysz.validator.generic;

import com.app.aprzybysz.dto.CinemaDto;

import java.util.Map;
import java.util.Objects;

public class CreateCinemaValidator extends AbstractValidator<CinemaDto> {

    @Override
    public Map<String, String> validate(CinemaDto cinema) {

        errors.clear();

        if (!isNameValid(cinema.getName())) {
            errors.put("name", "name is not valid");
        }


        return errors;


    }


    private boolean isNameValid(String name) {
        return Objects.nonNull(name) && name.matches("[A-Z]+");
    }
}