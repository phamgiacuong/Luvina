package luvina.service.Impl;

import luvina.model.Product;
import luvina.repository.ProductRepository;
import luvina.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {

        return productRepository.findAll();
    }

    @Override
    public List<Product> search(String searchs) {

        return productRepository.search(searchs);
    }

    @Override
    public Product findProductCd(String id) {
        return productRepository.findProductCd(id);
    }

    @Override
    public List<Product> findProductTypeCd(String productTypeCd) {
        return productRepository.findProductTypeCd(productTypeCd);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    @Transactional
    public void deleteByProductCd(String productCd) {
        productRepository.deleteProduct(productCd);
    }
}
