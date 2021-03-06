package luvina.service.Impl;

import luvina.model.Individual;
import luvina.repository.IndividualRespository;
import luvina.service.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndividualServiceImpl implements IndividualService {
    @Autowired
    private IndividualRespository individualRespository;

    @Override
    public Iterable<Individual> findAll() {
        return individualRespository.findAll();
    }

    @Override
    public void save(Individual individual){
        individualRespository.save(individual);
    }

    @Override
    public Individual findCust_ID (Integer cust_id){
        return individualRespository.findCust_id(cust_id);
    }


}
