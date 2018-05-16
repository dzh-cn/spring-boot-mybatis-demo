package spring.demo.boot.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.demo.boot.mybatis.entity.Product;
import spring.demo.boot.mybatis.mapper.ProductMapper;
import spring.demo.boot.mybatis.service.ProductService;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author dongzhihua
 * @since 2018-05-15
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public Product findProduct(Integer productId) {
		return productMapper.findProduct(productId);
	}

	@Override
	@Transactional
	public boolean updateProduct(Product product) {
		boolean s = productMapper.updateProduct(product) == 1;
		if (s) {
//			throw new RuntimeException("Failure");
		}
		return s;
	}
}
