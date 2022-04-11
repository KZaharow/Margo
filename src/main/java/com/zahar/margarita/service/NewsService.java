package com.zahar.margarita.service;

import com.zahar.margarita.entity.News;

import java.util.List;

public interface NewsService {

    News getNewsById(Long id);

    Long addNews(News News);

    void updateNews(News News);

    void deleteNews(Long id);

    List<News> getAllNews();

    void setNewsStatus(Long id);
}
