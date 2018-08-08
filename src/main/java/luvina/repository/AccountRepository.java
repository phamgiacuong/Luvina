package luvina.repository;

import luvina.model.Account;
import luvina.model.Business;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
