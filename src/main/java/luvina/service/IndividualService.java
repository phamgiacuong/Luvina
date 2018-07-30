package luvina.service;


import luvina.model.Individual;
import org.springframework.stereotype.Service;

@Service
public interface IndividualService {
    Iterable<Individual> findAll();
}
