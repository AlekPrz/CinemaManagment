package com.app.aprzybysz.dto;

import com.app.aprzybysz.model.City;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class CinemaDto {

    private String address;
    private String name;
    private City city;

}
