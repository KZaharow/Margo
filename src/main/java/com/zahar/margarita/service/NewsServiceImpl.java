package com.zahar.margarita.service;

import com.zahar.margarita.entity.News;
import com.zahar.margarita.exception.ExceptionMessage;
import com.zahar.margarita.repository.NewsRepository;
import com.zahar.margarita.status.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    @Override
    @Transactional
    public News getNewsById(Long id) {
        return newsRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ExceptionMessage.NEWS_NOT_FOUND));
    }

    @Override
    @Transactional
    public Long addNews(News News) {
        return newsRepository.save(News).getId();
    }

    @Override
    @Transactional
    public void updateNews(News News) {
        if (!Objects.isNull(News.getId())) newsRepository.save(News);
    }

    @Override
    @Transactional
    public void deleteNews(Long id) {
        News news = getNewsById(id);
        news.setStatus(false);
    }

    @Override
    @Transactional
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    @Override
    @Transactional
    public void setNewsStatus(Long id) {
        News news = getNewsById(id);
        news.setStatus(!news.isStatus());
    }
}
