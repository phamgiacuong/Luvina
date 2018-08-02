package luvina.service.Impl;

import luvina.model.Officer;
import luvina.repository.OfficerRespository;
import luvina.service.OfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfficerServiceImpl implements OfficerService {
    @Autowired
    private OfficerRespository officerRespository;

    @Override
    public Iterable<Officer> findAll() {
        return officerRespository.findAll();
    }

    @Override
    public void save(Officer officer) { officerRespository.save(officer); }

    @Override
    public Officer findCust_ID(Integer cust_id){
        return officerRespository.findCust_id(cust_id);
    }

}
