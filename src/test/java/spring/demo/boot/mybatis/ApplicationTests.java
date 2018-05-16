package spring.demo.boot.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.demo.boot.mybatis.entity.Product;
import spring.demo.boot.mybatis.mapper.ProductMapper;
import spring.demo.boot.mybatis.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	ProductService productService;

	private static Logger logger = LoggerFactory.getLogger(ApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("SpringBootMybatisDemoApplicationTests.contextLoads : {}", productService.findProduct(1));
		Product product = new Product();
		product.setProductId(1);
		product.setLastModifiedBy("abcc");
		boolean s = productService.updateProduct(product);
		logger.info("ApplicationTests.contextLoads : {}", s);
	}

}
