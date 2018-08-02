package luvina.model;

import lombok.AllArgsConstructor;
import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@Entity
@Table(name = "business")
public class Business {
    @Id
    @Column(name = "cust_id")
    Integer cust_id;
    @Column(name = "INCORP_DATE")
    Date incorp_date;
    @Column(name = "name")
    String name;
    @Column(name = "state_id")
    String state_id;

    public Business() {
    }

    public Date getIncorp_date() { return incorp_date; }
    public String getName() { return name; }
    public String getState_id() { return  state_id; }
    public Integer getCust_id() { return cust_id; }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

    public void setIncorp_date(Date incorp_date) {
        this.incorp_date = incorp_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }
}
