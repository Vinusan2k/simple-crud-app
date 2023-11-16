package com.produkte.produktlistebackend.repository;

import com.produkte.produktlistebackend.model.Produkt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduktRepository extends CrudRepository<Produkt, Long> {

}
