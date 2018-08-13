package luvina.repository;

import luvina.model.AccTransaction;
import luvina.model.Business;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AccTransactionRepository extends CrudRepository<AccTransaction, Integer> {

//    @Query("Select accountId from AccTransaction where AccTransaction.accountId = accountId")
//    AccTransaction findaccId(@Param("accountId") Integer accountId);


}
