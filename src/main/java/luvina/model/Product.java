package luvina.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date dateOffered;
    @Column(name = "date_retired")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date dateRetired;
    @Column(name = "name")
    String name;
    @Column(name = "price")
    Float price;
//    @Column(name = "product_type_cd")
//    String productTypeCd;
    @ManyToOne
    @JoinColumn(name = "product_type_cd")
    private ProductType productType;

    @Transient
    private int amount;

    public Product(){}


}
