package luvina.model;

import lombok.AllArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@AllArgsConstructor
@Entity
@Table(name = "individual")
public class Individual {
    @Column(name = "birth_date")
    private Date birth_date;
    @Column(name = "first_name")
    private String f_name;
    @Column(name = "last_name")
    private String l_name;
    @Id
    @Column(name = "cust_id")
    private Integer cust_id;
//    @OneToOne(mappedBy = "individual")
//    Customer customer;

    public Individual() {
    }

    public Integer getCust_id() {
        return cust_id;
    }

    public Date getBirth() {
        return birth_date;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

    public void setBirth(Date birth_date) {
        this.birth_date = birth_date;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

}