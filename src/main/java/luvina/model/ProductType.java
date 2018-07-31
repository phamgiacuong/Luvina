package luvina.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity
@Table(name = "product_type")
public class ProductType {
    @Id
    @Column(name = "product_type_cd")
    private String productTypeCd;
    @Column(name = "name")
    private String name;
    @OneToOne(mappedBy = "productType", cascade = CascadeType.ALL)
    private Product product;
    public ProductType(){}
}
