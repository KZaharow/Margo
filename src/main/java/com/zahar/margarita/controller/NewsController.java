package com.zahar.margarita.controller;

import com.zahar.margarita.entity.News;
import com.zahar.margarita.service.NewsService;
import com.zahar.margarita.status.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import static com.zahar.margarita.status.Status.ACTIVE;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("")
    public String getAllNews(Model model) {
        List<News> news = newsService.getAllNews();
        model.addAttribute("news", news);
        return "news";
    }

    @PostMapping("")
    public String addNews(Model model, @RequestParam String header, @RequestParam String text) {
        News news = new News();
        news.setDate(LocalDateTime.now());
        news.setHeader(header);
        news.setText(text);
        news.setStatus(ACTIVE);
        Long newsId = newsService.addNews(news);
        if (Objects.nonNull(newsId)){
            model.addAttribute("alert", newsId);
        } else {
            model.addAttribute("alert", 0L);
        }
        return getAllNews(model);
    }
}
