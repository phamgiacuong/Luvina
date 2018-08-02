package luvina.repository;

import luvina.model.Officer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface OfficerRespository extends CrudRepository<Officer, Integer> {

    @Query("SELECT i FROM Officer i WHERE i.cust_id =:cust_id")
    Officer findCust_id(@Param("cust_id") Integer cust_id);
}
