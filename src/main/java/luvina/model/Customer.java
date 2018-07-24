package luvina.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "cust_id")
    private Integer cust_id;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "cust_type_cd")
    private String cust_type_cd;
    @Column(name = "fed_id")
    private String fed_id;
    @Column(name = "postal_code")
    private String postal_code;
    @Column(name = "state")
    private String state;
//    @OneToOne
//    @JoinColumn(name = "cust_id")
//    private Individual Individual;
    
    public Customer(){
    }
}

