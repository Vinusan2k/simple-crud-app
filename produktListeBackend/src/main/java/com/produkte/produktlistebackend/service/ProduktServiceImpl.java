package com.produkte.produktlistebackend.service;

import com.produkte.produktlistebackend.model.Produkt;
import com.produkte.produktlistebackend.repository.ProduktRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduktServiceImpl implements ProduktService{

    @Autowired
    private ProduktRepository produktRepository;

    @Override
    public Produkt addProdukt(Produkt produkt) {
        return produktRepository.save(produkt);
    }

    @Override
    public Produkt getProduktById(long id) {
        return produktRepository.findById(id).get();
    }

    @Override
    public List<Produkt> getProdukte() {
        return (List<Produkt>) produktRepository.findAll();
    }

    @Override
    public void deleteProdukt(long id) {
        produktRepository.deleteById(id);

    }

    @Override
    public Produkt updateProdukt(Produkt produkt) {
        return produktRepository.save(produkt);
    }
}
