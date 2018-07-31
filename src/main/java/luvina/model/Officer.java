package luvina.model;

import lombok.AllArgsConstructor;
import javax.persistence.*;
import java.util.Date;


@AllArgsConstructor
@Entity
@Table (name = "Officer")
public class Officer {
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
    @Id
    @Column(name = "cust_id")
    private Integer cust_id;
//    @OneToOne
//    @JoinColumn(name = "cust_id")
//    private Customer customer;

    public Officer() {
    }

    public Integer getOfficer_id() { return officer_id; }
    public Date getEnd_date() { return end_date; }
    public String getF_name() { return f_name; }
    public String getL_name() { return l_name; }
    public Date getState_date() { return state_date; }
    public String getTitle() { return title; }
    public Integer getCust_id() { return cust_id; }
}
