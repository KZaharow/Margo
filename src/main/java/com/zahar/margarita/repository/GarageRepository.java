package com.zahar.margarita.repository;

import com.zahar.margarita.entity.Garage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends JpaRepository<Garage, Long> {

    @Query("SELECT COUNT(*) FROM Garage g WHERE g.number = :number")
    Long getGarageCountWithNumber(@Param("number") Long number);
}
