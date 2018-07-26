package luvina.service;

import java.util.List;
import luvina.model.Customer;

public interface CustomerService {
    // tim toan bo customer
    Iterable<Customer> findAll();

    //tim kiem customer theo thuoc tinh
    List<Customer> search(String q);

    //tìm kiem 1 product_ theo customerId
    Customer findCust_ID (Integer cust_id);

    //luu customer
    void save(Customer customer);

    //xoa 1 customer theo Cust_id
    void deleteByCust_id(Integer cust_id);

    Customer findCustomer(String userName);
}
