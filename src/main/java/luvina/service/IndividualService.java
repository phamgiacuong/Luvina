package luvina.service;


import luvina.model.Individual;
import org.springframework.stereotype.Service;

@Service
public interface IndividualService {
    Iterable<Individual> findAll();

//    void deleteByCust_id(Integer cust_id);

    void save(Individual individual);
    void saves(Individual individual);

    Individual findCust_ID (Integer cust_id);
}
