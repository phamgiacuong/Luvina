package luvina.repository;

import luvina.model.Customer;
import luvina.model.Individual;
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

    @Query("SELECT c.individual FROM Customer c Where c.individual.cust_id =:cust_id")
    List<Customer> findAll1(@Param("cust_id") Integer cust_id);
    @Query("SELECT c.business FROM Customer c Where c.business.cust_id =:cust_id")
    List<Customer> findAll2(@Param("cust_id") Integer cust_id);

    @Transactional
    @Modifying
    @Query("DELETE FROM Customer c WHERE c.cust_id =:cust_id")
    void deleteByCust_id(@Param("cust_id") Integer cust_id);

    @Query("SELECT c FROM Customer c WHERE c.address LIKE CONCAT('%',:search,'%') or c.city LIKE CONCAT('%',:search,'%') or c.cust_type_cd LIKE CONCAT('%',:search,'%') or " +
            "c.fed_id LIKE CONCAT('%',:search,'%') or c.postal_code LIKE CONCAT('%',:search,'%') or state LIKE CONCAT('%',:search,'%') or c.individual.f_name LIKE CONCAT('%',:search,'%')")
    List<Customer> search(@Param("search") String search);

    @Query("SELECT user FROM Customer user WHERE user.userName =:userName")
    Customer findUser(@Param("userName") String userName);

    @Transactional
    @Modifying
    @Query("UPDATE Customer c SET c.address =:address , c.city =:city, c.cust_type_cd =:cust_type_cd," +
          "  c.fed_id =:fed_id, c.postal_code=:postal_code, c.state =:state" +
          "  WHERE cust_id =:cust_id")
    void saves(@Param("cust_id") Integer cust_id,@Param("address") String address,@Param("city") String city,
        @Param("cust_type_cd") String cust_type_cd,@Param("fed_id") String fed_id,@Param("postal_code") String postal_code,
        @Param("state") String state);
}
