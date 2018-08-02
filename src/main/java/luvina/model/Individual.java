package luvina.model;

import lombok.AllArgsConstructor;

import java.sql.Date;
import javax.persistence.*;

@AllArgsConstructor
@Entity
@Table(name = "individual")
public class Individual {
    @Id
    @Column(name = "cust_id")
    private Integer cust_id;
    @Column(name = "birth_date")
    private Date birth_date;
    @Column(name = "first_name")
    private String f_name;
    @Column(name = "last_name")
    private String l_name;
//    @OneToOne(mappedBy = "individual", cascade = CascadeType.ALL)
//    Customer customer;

    public Individual() {
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public Integer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

}