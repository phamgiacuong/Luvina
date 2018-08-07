package luvina.model;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "emp_id")
    Integer emp_id;
    @Column(name = "end_date")
    Date end_date;
    @Column(name = "first_name")
    String first_name;
    @Column(name = "last_name")
    String last_name;
    @Column(name = "start_date")
    Date start_date;
    @Column(name = "title")
    String title;
    @Column(name = "assigned_branch_id")
    Integer assigned_branch_id;
    @Column(name = "dept_id")
    Integer dept_id;
    @Column(name = "superior_emp_id")
    Integer superior_emp_id;

    public Employee() {
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public String getTitle() {
        return title;
    }

    public Integer getAssigned_branch_id() {
        return assigned_branch_id;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public Integer getSuperior_emp_id() {
        return superior_emp_id;
    }


    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAssigned_branch_id(Integer assigned_branch_id) {
        this.assigned_branch_id = assigned_branch_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public void setSuperior_emp_id(Integer superior_emp_id) {
        this.superior_emp_id = superior_emp_id;
    }
}

