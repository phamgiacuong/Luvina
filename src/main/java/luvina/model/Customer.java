package luvina.model;

import lombok.Data;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "user_name")
    String userName;
    @Column(name = "password")
    String passWord;
//    @OneToOne
//    @JoinColumn(name = "cust_id")
//    private Individual Individual;
    
    public Customer(){
    }
}

