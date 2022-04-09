package com.zahar.margarita.service;

import com.zahar.margarita.entity.Garage;

import java.util.List;

public interface GarageService {

    Garage getGarageById(Long id);

    Long addGarage(Garage garage);

    void updateGarage(Garage garage);

    List<Garage> getAllGarages();
}
