package luvina.service;


import luvina.model.Business;

import org.springframework.stereotype.Service;

@Service
public interface BusinessService {

    Iterable<Business> findAll();

    void save(Business business);

    Business findCust_ID (Integer cust_id);
}