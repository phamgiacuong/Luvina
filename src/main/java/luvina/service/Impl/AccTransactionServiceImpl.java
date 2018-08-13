package luvina.service.Impl;

import luvina.model.AccTransaction;
import luvina.repository.AccTransactionRepository;
import luvina.service.AccTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccTransactionServiceImpl implements AccTransactionService {
    @Autowired
    private AccTransactionRepository accTransactionRepository;
    @Override
    public void save(AccTransaction accTransaction) {
        accTransactionRepository.save(accTransaction);
    }

//    public AccTransaction findAccId(Integer accountId) {
//        return accTransactionRepository.findaccId(accountId);
//    }
}
