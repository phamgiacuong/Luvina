package luvina.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_cd")
    String productCd;
    @Column(name = "date_offered")
    Date dateOffered;
    @Column(name = "date_retired")
    Date dateRetired;
    @Column(name = "name")
    String name;
//    @Column(name = "product_type_cd")
//    String productTypeCd;

    
    @ManyToOne
    @JoinColumn(name = "product_type_cd")
    private ProductType productType;


    public Product(){}

//    public Product(String productCd, Date dateOffered, Date dateRetired, String name, String productTypeCd) {
//        this.productCd = productCd;
//        this.dateOffered = dateOffered;
//        this.dateRetired = dateRetired;
//        this.name = name;
//        this.productTypeCd = productTypeCd;
//    }
}
