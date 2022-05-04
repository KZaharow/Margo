package com.zahar.margarita.controller;

import com.zahar.margarita.entity.Garage;
import com.zahar.margarita.entity.News;
import com.zahar.margarita.service.GarageService;
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
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/garage")
public class GarageController {

    @Autowired
    GarageService garageService;

    @GetMapping("")
    public String getAllGarages(Model model) {
        List<Garage> garages = garageService.getAllGarages();
        model.addAttribute("garages", garages);
        return "garages";
    }
}
