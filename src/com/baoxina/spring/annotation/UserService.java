package com.baoxina.spring.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	//得到dao对象
	//1.定义dao类型属性，在dao属性上面使用注解完成对象注入
	/**
	 * 注入属性的第①种方式(byType方式)
	 * Autowired默认先按byType，如果发现找到多个bean，则，又按照byName方式比对，如果还有多个，则报出异常。
	 * 1. spring先找类型为UserDAO的bean
	   2. 如果存在且唯一，则OK；
	   3. 如果不唯一，在结果集里，寻找name为userDAO的bean。因为bean的name有唯一性，所以，到这里应该能确定是否存在满足要求的bean了
	   @Autowired也可以手动指定按照byName方式注入，使用@Qualifier标签，例如：
		@Autowired ()
		@Qualifier ("baseDao")
		
	        注入属性的第②种方式(byName方式)常用
	   @Resource(name="对应所要注入对象bean的id值")     
	 */
//	@Autowired
//	@Qualifier("studentDAO")
	@Resource(name="studentDAO")
	private BaseDAO baseDao;
	//使用注解方式的时候不需要Setter方法
	public void add(){
		System.out.println("service.....");
		baseDao.add();
	}
}
