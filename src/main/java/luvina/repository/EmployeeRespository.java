package luvina.repository;

import luvina.model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

public interface EmployeeRespository extends CrudRepository<Employee, Integer> {
    //Tìm kiếm Employee theo Emp_id
    @Query("SELECT i FROM Employee i WHERE i.emp_id =:emp_id")
    Employee findEmp_id(@Param("emp_id") Integer emp_id);

    //Tìm kiếm Employee theo tất cả các thuộc tính
    @Query("SELECT e FROM Employee e WHERE  e.first_name LIKE CONCAT('%',:search,'%') " +
            "OR e.last_name LIKE CONCAT('%',:search,'%')" + "OR e.title LIKE CONCAT('%',:search,'%')" +
            "OR e.emp_id LIKE CONCAT('%',:search,'%')" + "OR e.start_date LIKE CONCAT('%',:search,'%')" +
            "OR e.assigned_branch_id LIKE CONCAT('%',:search,'%')" + "OR e.dept_id LIKE CONCAT('%',:search,'%')" +
            "OR e.superior_emp_id LIKE CONCAT('%',:search,'%')"
    )
    List<Employee> search(@Param("search") String search);

    //Xóa một Employee theo Emp_id
    @Transactional
    @Modifying
    @Query("DELETE FROM Employee e WHERE e.emp_id =:emp_id")
    void deleteEmployee(@Param("emp_id") Integer emp_id);
    //Edit employee
//    @Transactional
//    @Modifying
//    @Query("UPDATE Employee e SET e.end_date =:end_date , e.first_name =:first_name, e.last_name =:e.last_name," +
//            "  e.start_date =:start_date, e.title=:title, e.assigned_branch_id =:assigned_branch_id, e.dept_id := e.dept_id, e.superior_emp_id := superior_emp_id  WHERE emp_id =:emp_id")
//    void save(@Param("emp_id") Integer emp_id, @Param("end_date") Date end_date, @Param("first_name") String first_name,
//              @Param("last_name") String last_name, @Param("start_date") Date start_date, @Param("title") String title,
//              @Param("assigned_branch_id") Integer assigned_branch_id, @Param("dept_id") Integer dept_id, @Param("superior_emp_id") Integer superior_emp_id);
}
