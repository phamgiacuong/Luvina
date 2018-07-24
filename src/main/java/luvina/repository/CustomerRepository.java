package luvina.repository;

import luvina.model.Customer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    //tìm kiem 1 product theo cust_id
    @Query("SELECT c FROM Customer c WHERE c.cust_id =:cust_id")
    Customer findCust_id(@Param("cust_id") Integer cust_id);
    
    @Transactional
    @Modifying
    @Query("DELETE FROM Customer c WHERE c.cust_id =:cust_id")
    void deleteByCust_id(@Param("cust_id") Integer cust_id);

    @Query("SELECT c FROM Customer c WHERE c.address LIKE CONCAT('%',:search,'%')")
    List<Customer> search(@Param("search") String search);

}
