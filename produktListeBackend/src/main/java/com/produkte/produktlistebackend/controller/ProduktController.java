package com.produkte.produktlistebackend.controller;

import com.produkte.produktlistebackend.model.Produkt;
import com.produkte.produktlistebackend.service.ProduktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ProduktController {

    @Autowired
    private ProduktService produktService;

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/add")
    public String addProdukt(@RequestBody Produkt produkt){
        produktService.addProdukt(produkt);
        return "Produkt hinzugefügt";
    }

    @RequestMapping("/produkt/{id}")
    public Produkt getProduktById(@PathVariable("id") long id){
        return produktService.getProduktById(id);
    }

    @RequestMapping("/produkte")
    public List<Produkt> getProdukte(){
        return produktService.getProdukte();
    }

    @PutMapping("/produkt")
    public Produkt updateProdukt(@RequestBody Produkt produkt){
        return produktService.updateProdukt(produkt);
    }

    @DeleteMapping("/produkt/{id}")
    public String deleteProdukt(@PathVariable("id") long id){
        produktService.deleteProdukt(id);
        return "Produkt gelöscht";
    }

}
