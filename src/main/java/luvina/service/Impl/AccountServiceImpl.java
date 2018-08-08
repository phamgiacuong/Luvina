package luvina.service.Impl;

import luvina.model.Account;
import luvina.repository.AccountRepository;
import luvina.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }
}
