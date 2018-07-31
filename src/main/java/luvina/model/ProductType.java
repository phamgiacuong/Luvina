package luvina.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.text.CollationElementIterator;
import java.util.Collection;

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
    @OneToMany(mappedBy = "productType", cascade = CascadeType.ALL)
    private Collection<Product> products;
    public ProductType(){}
}
