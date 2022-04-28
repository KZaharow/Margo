package com.zahar.margarita.service;

import com.zahar.margarita.entity.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NewsService {

    News getNewsById(Long id);

    Long addNews(News News);

    void updateNews(News News);

    void deleteNews(Long id);

    Page<News> getAllNews(int pageNumber);

    void setNewsStatus(Long id);
}
