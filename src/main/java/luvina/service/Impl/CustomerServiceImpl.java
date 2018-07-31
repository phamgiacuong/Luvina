package luvina.service.Impl;

import luvina.model.Individual;
import luvina.repository.CustomerRepository;
import luvina.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import luvina.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }
    @Override
    public List<Customer> findAll1(Integer cust_id) {
        return customerRepository.findAll1(cust_id);
    }
    @Override
    public List<Customer> findAll2(Integer cust_id) {
        return customerRepository.findAll2(cust_id);
    }

    @Override
    public List<Customer> search(String searchs) {
        return customerRepository.search(searchs);
    }

    @Override
    public Customer findCust_ID(Integer cust_id) {
        return customerRepository.findCust_id(cust_id);
    }

    @Override
    public void saves(Customer customer) {
        customerRepository.saves(customer.getCust_id(),customer.getAddress(),customer.getCity(),customer.getCust_type_cd(),customer.getFed_id(),customer.getPostal_code(),customer.getState());
//        return customer;
    }

    public void save(Customer customer){
        customerRepository.save(customer);
    }

    @Override
    @Transactional
    public void deleteByCust_id(Integer cust_id) {
        customerRepository.deleteByCust_id(cust_id);
    }
    @Override
    public Customer findCustomer(String user) {
        return customerRepository.findUser(user);
    }

}
