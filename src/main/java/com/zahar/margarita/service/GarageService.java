package com.zahar.margarita.service;

import com.zahar.margarita.entity.Garage;
import com.zahar.margarita.exception.GarageException;

import java.util.List;

public interface GarageService {

    Garage getGarageById(Long id);

    Long addGarage(Garage garage) throws GarageException;

    void updateGarage(Garage garage);

    List<Garage> getAllGarages();

    void isExistGarageWithNumber(Long id) throws GarageException;
}
