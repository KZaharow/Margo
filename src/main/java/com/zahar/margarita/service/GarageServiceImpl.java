package com.zahar.margarita.service;

import com.zahar.margarita.entity.Garage;
import com.zahar.margarita.exception.ExceptionMessage;
import com.zahar.margarita.repository.GarageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class GarageServiceImpl implements GarageService {

    private final GarageRepository garageRepository;

    @Override
    @Transactional
    public Garage getGarageById(Long id) {
        return garageRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ExceptionMessage.GARAGE_NOT_FOUND));
    }

    @Override
    @Transactional
    public Long addGarage(Garage garage) {
        return garageRepository.save(garage).getId();
    }

    @Override
    @Transactional
    public void updateGarage(Garage garage) {
        if (!Objects.isNull(garage.getId())) garageRepository.save(garage);
    }

    @Override
    @Transactional
    public List<Garage> getAllGarages() {
        return garageRepository.findAll();
    }
}
