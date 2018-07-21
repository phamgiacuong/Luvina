package luvina.service;

import luvina.model.ProductType;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public interface ProductTypeService {
    // tim toan bo product_type
    Iterable<ProductType> findAll();

    //tim kiem product_type theo product_type_cd hoac name
    List<ProductType> search(String q);

    //tìm kiem 1 product_type theo product_type_cd
    ProductType findProductTypeCd(String productTypeCd);

    //luu product_type
    void save(ProductType productType);

    //xoa 1 product_type theo product_type_cd
    @Modifying
    void deleteByProductTypeCd(String productTypeCd);

}