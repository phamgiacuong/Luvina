package luvina.repository;

import java.util.List;

import luvina.model.ProductType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ProductTypeRepository extends CrudRepository<ProductType, Integer> {

    @Query("SELECT p FROM ProductType p WHERE p.productTypeCd LIKE CONCAT('%',:search,'%') OR p.name LIKE CONCAT('%',:search,'%')")
    List<ProductType> search(@Param("search") String search);

    @Query("SELECT p FROM ProductType p WHERE p.productTypeCd =:productTypeCd")
    ProductType findProductTypeCd(@Param("productTypeCd") String productTypeCd);
    @Transactional
    @Modifying
    @Query("DELETE FROM ProductType p WHERE p.productTypeCd =:productTypeCd")
    void deleteProductType(@Param("productTypeCd") String productTypeCd);


//    ProductType findByproductTypeCd(String id);
//
//    List<ProductType> findByNameContaining(String name);

//    @Query("DELETE FROM product_type p WHERE p.productTypeCd = :id ")
//    void deleteById(@Param("id")String id);
}