package luvina.service.Impl;

import luvina.model.Employee;
import luvina.repository.EmployeeRespository;
import luvina.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRespository employeeRespository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRespository.findAll();
    }

    @Override
    public Employee find_EmpID(Integer emp_id) {
        return employeeRespository.findEmp_id(emp_id);
    }

    @Override
    public void deleteByEmpID(Integer emp_id) {
        employeeRespository.deleteEmployee(emp_id);
    }

    @Override
    public void save(Employee employee) {
        employeeRespository.save(employee);
    }

    @Override
    public List<Employee> search(String q) {
        return employeeRespository.search(q);
    }
}