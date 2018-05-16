package spring.demo.boot.mybatis.service;

import spring.demo.boot.mybatis.entity.Product;

/**
 * <p>
 * 产品表 服务类
 * </p>
 *
 * @author dongzhihua
 * @since 2018-05-15
 */
public interface ProductService {

	Product findProduct(Integer productId);

	boolean updateProduct(Product product);
}
