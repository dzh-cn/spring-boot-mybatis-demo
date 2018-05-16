package spring.demo.boot.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import spring.demo.boot.mybatis.entity.Product;

/**
 * <p>
 * 产品表 Mapper 接口
 * </p>
 *
 * @author dongzhihua
 * @since 2018-05-15
 */
@Mapper
public interface ProductMapper {

	//	@Select("select * from abs_mall_product where product_id = #{productId}")
	Product findProduct(Integer productId);
	int updateProduct(Product product);
}
