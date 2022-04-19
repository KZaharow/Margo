package com.zahar.margarita.controller;

import com.zahar.margarita.entity.News;
import com.zahar.margarita.service.NewsService;
import com.zahar.margarita.status.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.List;
import java.util.Objects;

import static com.zahar.margarita.status.Status.ACTIVE;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("/status/{id}")
    public String setNewsStatus(Model model, @PathVariable Long id) {
        newsService.setNewsStatus(id);
        List<News> news = newsService.getAllNews();
        model.addAttribute("news", news);
        return "news";
    }

    @GetMapping("/update/{id}")
    public String putNews(Model model, @PathVariable Long id)
    {
        News news = newsService.getNewsById(id);
        model.addAttribute("news", news);
        return "news_update";
    }

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
        news.setStatus(false);
        Long newsId = newsService.addNews(news);
        if (Objects.nonNull(newsId)){
            model.addAttribute("alert", newsId);
        } else {
            model.addAttribute("alert", 0L);
        }
        return getAllNews(model);
    }

    @PostMapping("/update")
    public String putNews(Model model,
                          @RequestParam Long id,
                          @RequestParam String header,
                          @RequestParam String text,
                          @RequestParam boolean chkbx) {
        News news = new News();
        news.setId(id);
        news.setDate(LocalDateTime.now());
        news.setHeader(header);
        news.setText(text);
        news.setStatus(chkbx);
        newsService.updateNews(news);
        return getAllNews(model);
    }
}
