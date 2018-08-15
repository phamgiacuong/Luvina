package luvina.repository;

import luvina.model.AccTransaction;
import luvina.model.Business;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AccTransactionRepository extends CrudRepository<AccTransaction, Integer> {

    @Query(nativeQuery = true,value = "Select amount from acc_transaction where acc_transaction.account_id =:accountId")
    Float findAmount(@Param("accountId") Integer accountId);

}
