package luvina.service;

import java.util.List;
import luvina.model.Customer;

public interface CustomerService {
    // tim toan bo customer
    Iterable<Customer> findAll();

    List<Customer> findAll1(Integer cust_id);
    List<Customer> findAll2(Integer cust_id);
    List<Customer> findAll3(Integer cust_id);

    //tim kiem customer theo thuoc tinh
    List<Customer> search(String q);

    //tìm kiem 1 customer theo cust_Id
    Customer findCust_ID (Integer cust_id);

    //luu customer
    void saves(Customer customer);

    void save(Customer customer);

    //xoa 1 customer theo Cust_id
    void deleteByCust_id(Integer cust_id);

    Customer findCustomer(String userName);
    Customer login(String userName ,String passWord);




}
