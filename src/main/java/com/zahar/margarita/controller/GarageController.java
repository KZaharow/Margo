package com.zahar.margarita.controller;

import com.zahar.margarita.entity.Garage;
import com.zahar.margarita.entity.News;
import com.zahar.margarita.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/garage")
public class GarageController {

    @Autowired
    GarageService garageService;

    @GetMapping("")
    public String getAllGarages(Model model) {
        List<Garage> garages = garageService.getAllGarages();
        model.addAttribute("garages", garages);
        return "garage";
    }

    @GetMapping("/update/{id}")
    public String updateGarage(Model model, @PathVariable @Min(1) Long id) {
        Garage garage = garageService.getGarageById(id);
        model.addAttribute("garage", garage);
        return "garage_update";
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
