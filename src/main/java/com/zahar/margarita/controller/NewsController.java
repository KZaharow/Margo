package com.zahar.margarita.controller;

import com.zahar.margarita.entity.News;
import com.zahar.margarita.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

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
    public String putNews(Model model, @PathVariable Long id) {
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
        if (Objects.nonNull(newsId)) {
            model.addAttribute("alert", newsId);
        } else {
            model.addAttribute("alert", 0L);
        }
        return getAllNews(model);
    }

    @PostMapping("/update")
    public String putNews(@RequestParam Long id,
                          @RequestParam String header,
                          @RequestParam String text,
                          @RequestParam(defaultValue = "") String isStatus,
                          @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date) {
        News news = new News(id, date, header, text, !isStatus.equals(""));
        newsService.updateNews(news);
        return "redirect:/news";
    }
}
