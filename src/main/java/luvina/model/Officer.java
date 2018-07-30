package luvina.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
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

}
