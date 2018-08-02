package luvina.model;

import lombok.AllArgsConstructor;
import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@Entity
@Table (name = "officer")
public class Officer {

    @Id
    @Column(name = "cust_id")
    private Integer cust_id;
    @Column( name = "officer_id")
    Integer officer_id;
    @Column(name = "end_date")
    Date end_date;
    @Column(name = "first_name")
    String f_name;
    @Column(name = "last_name")
    String l_name;
    @Column(name = "start_date")
    Date state_date;
    @Column(name = "title")
    String title;
//    @OneToOne
//    @JoinColumn(name = "cust_id")
//    private Customer customer;

    public Officer() {
    }

    public Integer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

    public Integer getOfficer_id() {
        return officer_id;
    }

    public void setOfficer_id(Integer officer_id) {
        this.officer_id = officer_id;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
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

    public Date getState_date() {
        return state_date;
    }

    public void setState_date(Date state_date) {
        this.state_date = state_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
