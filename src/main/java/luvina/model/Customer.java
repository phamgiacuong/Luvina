package luvina.model;

import lombok.Data;

import javax.persistence.*;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;

@AllArgsConstructor
//@Data
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
    public Integer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCust_type_cd() {
        return cust_type_cd;
    }

    public void setCust_type_cd(String cust_type_cd) {
        this.cust_type_cd = cust_type_cd;
    }

    public String getFed_id() {
        return fed_id;
    }

    public void setFed_id(String fed_id) {
        this.fed_id = fed_id;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

