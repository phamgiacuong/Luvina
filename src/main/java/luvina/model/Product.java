package luvina.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    @Column(name = "product_type_cd")
    String productTypeCd;

    public Product(){}
}
