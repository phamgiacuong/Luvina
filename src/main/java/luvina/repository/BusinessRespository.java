package luvina.repository;

import luvina.model.Business;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BusinessRespository extends CrudRepository<Business, Integer> {

    @Query("SELECT i FROM Business i WHERE i.cust_id =:cust_id")
    Business findCust_id(@Param("cust_id") Integer cust_id);

}
