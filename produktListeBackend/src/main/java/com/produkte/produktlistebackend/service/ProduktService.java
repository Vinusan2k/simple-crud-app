package com.produkte.produktlistebackend.service;

import com.produkte.produktlistebackend.model.Produkt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProduktService {

    public Produkt addProdukt(Produkt produkt);

    public Produkt getProduktById(long id);

    public List<Produkt> getProdukte();

    public void deleteProdukt(long id);

    public Produkt updateProdukt(Produkt produkt);

}
