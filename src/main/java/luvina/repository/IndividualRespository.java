package luvina.repository;

import luvina.model.Customer;
import luvina.model.Individual;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public interface IndividualRespository extends CrudRepository<Individual, Integer> {

    @Query("SELECT i FROM Individual i WHERE i.cust_id =:cust_id")
    Individual findCust_id(@Param("cust_id") Integer cust_id);

    @Transactional
    @Modifying
    @Query("UPDATE Individual i SET BIRTH_DATE=:birth_date,FIRST_NAME=:f_name,LAST_NAME=:l_name WHERE i.cust_id =:cust_id")
    void saves(@Param("cust_id") Integer cust_id, @Param("birth_date") Date birth_date, @Param("f_name") String f_name, @Param("l_name") String l_name);

}
