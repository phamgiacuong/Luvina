package luvina.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/*
 * Lu tru thong tin cua khach hang
 *
 * */
@AllArgsConstructor
@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "password")
    private String password;
    @OneToOne
    @JoinColumn(name = "cust_id")
    private Individual individual;
    @OneToOne
    @JoinColumn(name = "cust_id")
    private Officer officer;
    @OneToOne
    @JoinColumn(name = "cust_id")
    private Business business;
    @OneToMany(mappedBy = "custId")
    private List<Account> listAccount;

    //
    public Customer() {
    }
    /*
     * Noi dung ham:
     * Param1:
     * Param2:
     * return:
     * */

}


