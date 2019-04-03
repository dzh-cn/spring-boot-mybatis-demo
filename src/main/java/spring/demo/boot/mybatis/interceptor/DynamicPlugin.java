package spring.demo.boot.mybatis.interceptor;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;

import java.util.Properties;

/**
 * 多数据源插件
 *
 * @author: dongzhihua
 * @time: 2018/5/25 15:08:12
 */
public class DynamicPlugin implements Interceptor {
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		return null;
	}

	@Override
	public Object plugin(Object target) {
		return null;
	}

	@Override
	public void setProperties(Properties properties) {

	}
}
