package luvina.service.Impl;

import java.util.List;

import luvina.model.ProductType;
import luvina.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import luvina.repository.ProductTypeRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
	
	@Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public Iterable<ProductType> findAll() {

        return productTypeRepository.findAll();
    }

    @Override
    public List<ProductType> search(String searchs) {

        return productTypeRepository.search(searchs);
    }

    @Override
    public ProductType findProductTypeCd(String id) {
        return productTypeRepository.findProductTypeCd(id);
    }

    @Override
    public void save(ProductType productType) {
        productTypeRepository.save(productType);
    }

    @Override
    @Transactional
    public void deleteByProductTypeCd(String productTypeCd) {
        productTypeRepository.deleteProductType(productTypeCd);
    }

}