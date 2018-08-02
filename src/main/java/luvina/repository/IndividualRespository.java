package luvina.repository;

import luvina.model.Individual;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IndividualRespository extends CrudRepository<Individual, Integer> {

    @Query("SELECT i FROM Individual i WHERE i.cust_id =:cust_id")
    Individual findCust_id(@Param("cust_id") Integer cust_id);

}
