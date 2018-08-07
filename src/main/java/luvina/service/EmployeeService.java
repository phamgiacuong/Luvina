package luvina.service;

import luvina.model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService{
    Iterable<Employee> findAll();
    //tim kiem employee theo thuoc tinh
    List<Employee> search(String q);
    //Tim kiem employee theo emp_id
    Employee find_EmpID(Integer emp_id);
    @Modifying
    //Xoa employee
    void deleteByEmpID(Integer emp_id);
    //Luu employee
    void save(Employee employee);
}
