package luvina.service;

import luvina.model.Product;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public interface ProductService {
    // tim toan bo product_
    Iterable<Product> findAll();

    //tim kiem product theo thuoc tinh
    List<Product> search(String q);

    //tìm kiem 1 product_ theo product_cd
    Product findProductCd(String productCd);

    List<Product> findProductTypeCd(String productTypeCd);

    //luu product_
    void save(Product product);

    //xoa 1 product theo product_cd
    @Modifying
    void deleteByProductCd(String productCd);
}
