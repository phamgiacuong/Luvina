package luvina.repository;

import luvina.model.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, String> {
    //tim kiem product theo cac tuoc tinh
    @Query("SELECT p FROM Product p WHERE p.productTypeCd LIKE CONCAT('%',:search,'%') OR p.name LIKE CONCAT('%',:search,'%') " +
            "OR p.productCd LIKE CONCAT('%',:search,'%')")
    List<Product> search(@Param("search") String search);

    //tìm kiem 1 product theo product_cd
    @Query("SELECT p FROM Product p WHERE p.productCd =:productCd")
    Product findProductCd(@Param("productCd") String productCd);

    //xoa 1 product theo product_cd
    @Transactional
    @Modifying
    @Query("DELETE FROM Product p WHERE p.productCd =:productCd")
    void deleteProduct(@Param("productCd") String productCd);
}
