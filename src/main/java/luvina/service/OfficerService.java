package luvina.service;

import luvina.model.Officer;
import org.springframework.stereotype.Service;

@Service
public interface OfficerService {

    Iterable<Officer> findAll();

    void save(Officer officer);

    Officer findCust_ID (Integer cust_id);
}
