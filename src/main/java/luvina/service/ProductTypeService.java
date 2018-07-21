package luvina.service;

import luvina.model.ProductType;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public interface ProductTypeService {

    Iterable<ProductType> findAll();

    List<ProductType> search(String q);

    ProductType findProductTypeCd(String productTypeCd);

    void save(ProductType productType);

    @Modifying
    void deleteByProductTypeCd(String productTypeCd);

//    Iterable<ProductType> findAll();
//
//    List<ProductType> search(String q);
//
//    ProductType findByProductTypeCd(String id);
//
////    ProductType findByName(String name);
//
//    void save(ProductType productType);
//
//
////    void deleteById(String id);

}