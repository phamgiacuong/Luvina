package luvina.service.Impl;

import luvina.model.Business;
import luvina.repository.BusinessRespository;
import luvina.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessRespository businessRespository;

    @Override
    public Iterable<Business> findAll() {
        return businessRespository.findAll();
    }

    @Override
    public void save(Business business){
        businessRespository.save(business);
    }

    @Override
    public Business findCust_ID(Integer cust_id){
        return businessRespository.findCust_id(cust_id);
    }

}

