package com.zahar.margarita.controller;

import com.zahar.margarita.entity.News;
import com.zahar.margarita.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.time.LocalDateTime;
import java.util.Objects;

@Controller
@Validated
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("/status/{id}")
    public String setNewsStatus(Model model, @PathVariable Long id) {
        newsService.setNewsStatus(id);
        Page<News> news = newsService.getAllNews(1);
        model.addAttribute("news", news);
        return "news";
    }

    @GetMapping("/create")
    public String addNews(Model model) {
        News news = new News(null, LocalDateTime.now(), "", "", true);
        model.addAttribute("news", news);
        return "news_create";
    }

    @GetMapping("/update/{id}")
    public String putNews(Model model, @PathVariable @Min(1) Long id) {
        News news = newsService.getNewsById(id);
        model.addAttribute("news", news);
        return "news_update";
    }

    @GetMapping("/{id}")
    public String getAllNews(Model model, @PathVariable int id) {
        Page<News> news = newsService.getAllNews(id < 0 ? 0 : id);
        model.addAttribute("news", news);
        return "news";
    }

    @PostMapping("")
    public String createNews(@RequestParam String header,
                             @RequestParam String text,
                             @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date) {
        News news = new News(null, date, header, text, true);
        newsService.addNews(news);
        return "redirect:/news";
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
