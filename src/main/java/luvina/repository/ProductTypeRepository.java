package luvina.repository;

import java.util.List;

import luvina.model.ProductType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ProductTypeRepository extends CrudRepository<ProductType, String> {
    //tim kiem product_type theo product_type_cd hoac name
    @Query("SELECT p FROM ProductType p WHERE p.productTypeCd LIKE CONCAT('%',:search,'%') OR p.name LIKE CONCAT('%',:search,'%')")
    List<ProductType> search(@Param("search") String search);

    //tìm kiem 1 product_type theo product_type_cd
    @Query("SELECT p FROM ProductType p WHERE p.productTypeCd =:productTypeCd")
    ProductType findProductTypeCd(@Param("productTypeCd") String productTypeCd);

    //xoa 1 product_type theo product_type_cd
    @Transactional
    @Modifying
    @Query("DELETE FROM ProductType p WHERE p.productTypeCd =:productTypeCd")
    void deleteProductType(@Param("productTypeCd") String productTypeCd);


}