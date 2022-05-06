package com.zahar.margarita.service;

import com.zahar.margarita.entity.Garage;
import com.zahar.margarita.exception.ExceptionMessage;
import com.zahar.margarita.exception.GarageException;
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
    public Long addGarage(Garage garage) throws GarageException {
        isExistGarageWithNumber(garage.getNumber());
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

    @Override
    @Transactional
    public void isExistGarageWithNumber(Long number) throws GarageException {
        Long count = garageRepository.getGarageCountWithNumber(number);
        if (count != 0) throw new GarageException(ExceptionMessage.GARAGE_WITH_SAME_NUMBER_IS_EXIST_ALREADY);
    }
}
