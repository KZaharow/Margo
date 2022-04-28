package com.zahar.margarita.service;

import com.zahar.margarita.entity.News;
import com.zahar.margarita.exception.ExceptionMessage;
import com.zahar.margarita.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;
    @Value("${maxPageRecords}")
    private int maxPageRecords;

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
    public Page<News> getAllNews(int pageNumber) {
        PageRequest pageRequest = PageRequest.of(pageNumber, maxPageRecords, Sort.by("date").descending());
        return newsRepository.findAll(pageRequest);
    }

    @Override
    @Transactional
    public void setNewsStatus(Long id) {
        News news = getNewsById(id);
        news.setStatus(!news.isStatus());
    }
}
