package luvina.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
    private String userName;
    @Column(name = "password")
    private String passWord;
    @OneToOne
    @JoinColumn(name = "cust_id")
    private Individual individual;
    @OneToOne
    @JoinColumn(name = "cust_id")
    Officer officer;
    @OneToOne
    @JoinColumn(name = "cust_id")
    private Business business;
    
    public Customer(){
    }

    public Individual getIndividual() { return  individual; }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
}

