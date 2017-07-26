package com.baoxina.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	//�õ�dao����
	//1.����dao�������ԣ���dao��������ʹ��ע����ɶ���ע��
	/**
	 * AutowiredĬ���Ȱ�byType����������ҵ����bean�����ְ���byName��ʽ�ȶԣ�������ж�����򱨳��쳣��
	 * 1. spring��������ΪUserDAO��bean
	   2. ���������Ψһ����OK��
	   3. �����Ψһ���ڽ�����Ѱ��nameΪuserDAO��bean����Ϊbean��name��Ψһ�ԣ����ԣ�������Ӧ����ȷ���Ƿ��������Ҫ���bean��
	   @AutowiredҲ�����ֶ�ָ������byName��ʽע�룬ʹ��@Qualifier��ǩ�����磺
		@Autowired ()
		@Qualifier ("baseDao")
	 */
	@Autowired
	@Qualifier("studentDAO")
	private BaseDAO baseDao;
	//ʹ��ע�ⷽʽ��ʱ����ҪSetter����
	public void add(){
		System.out.println("service.....");
		baseDao.add();
	}
}
