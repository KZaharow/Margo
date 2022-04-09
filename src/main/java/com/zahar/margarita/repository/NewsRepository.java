package com.zahar.margarita.repository;

import com.zahar.margarita.entity.Garage;
import com.zahar.margarita.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

}
