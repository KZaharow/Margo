package com.zahar.margarita.controller;

import com.zahar.margarita.entity.Garage;
import com.zahar.margarita.entity.Person;
import com.zahar.margarita.exception.GarageException;
import com.zahar.margarita.service.GarageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.util.List;

@Controller
@RequestMapping("/garage")
@RequiredArgsConstructor
public class GarageController {

    private final GarageService garageService;

    @GetMapping("")
    public String getAllGarages(Model model) {
        List<Garage> garages = garageService.getAllGarages();
        model.addAttribute("garages", garages);
        return "garage";
    }

    @GetMapping("/add")
    public String addGarage(Model model) {
        return "garage_add";
    }

    @PostMapping("/add")
    public String addNews(@RequestParam Long number,
                          @RequestParam String description,
                          @RequestParam(defaultValue = "0") Double square,
                          @RequestParam(defaultValue = "") String isPrivate) throws GarageException {
        Person person = new Person();
        person.setFirstName("И");
        person.setLastName("Ф");
        person.setPatronymic("О");
        Garage garage = new Garage(null, number, person, !isPrivate.equals(""), square, description);
        garageService.addGarage(garage);
        return "redirect:/garage/";
    }

    @GetMapping("/update/{id}")
    public String updateGarage(Model model, @PathVariable @Min(1) Long id) {
        Garage garage = garageService.getGarageById(id);
        model.addAttribute("garage", garage);
        return "garage_update";
    }

    @PostMapping("/update")
    public String putNews(@RequestParam Long id,
                          @RequestParam Long number,
                          @RequestParam String description,
                          @RequestParam Person owner,
                          @RequestParam Double square,
                          @RequestParam(defaultValue = "") String isPrivate) {
        Garage garage = new Garage(id, number, owner, !isPrivate.equals(""), square, description);
        garageService.updateGarage(garage);
        return "redirect:/garage/";
    }
}
