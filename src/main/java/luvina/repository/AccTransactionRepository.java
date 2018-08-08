package luvina.repository;

import luvina.model.AccTransaction;
import luvina.model.Business;
import org.springframework.data.repository.CrudRepository;

public interface AccTransactionRepository extends CrudRepository<AccTransaction, Integer> {
}
