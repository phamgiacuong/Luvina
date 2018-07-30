package luvina.model;

import lombok.AllArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@Entity
@Table(name = "business")
public class Business {
    @Column(name = "INCORP_DATE")
    Date incorp_date;
    @Column(name = "name")
    String name;
    @Column(name = "state_id")
    String state_id;
    @Id
    @Column(name = "cust_id")
    Integer cust_id;

    public Business() {
    }

    public Date getIncorp_date() { return incorp_date; }
    public String getName() { return name; }
    public String getState_id() { return  state_id; }
    public Integer getCust_id() { return cust_id; }

}
