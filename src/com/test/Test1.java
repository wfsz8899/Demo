package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.domain.User;
import com.mapper.UserMapper;

public class Test1 {

	@Test
	public void test() throws Exception {
		InputStream inputStream=Resources.getResourceAsStream("myBatis-config.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sessionFactory.openSession();
		//使用session方式
		/*User user = session.selectOne("getUser", 1);
		System.out.println(user);*/
		
		UserMapper mapper = session.getMapper(UserMapper.class);//insert
//		Map<String,String> map2 = new HashMap<>();
//		map2.put("name", "李四");
//		map2.put("note", "李四他爹");
//		mapper.insert(map2);
		
//		Map<String,Object> map = new HashMap<>();//map传递参数
//		map.put("name","小");
//		map.put("note", "六");
//		List<User> user = mapper.getUser(map);
		
		
//		List<User> user = mapper.getUser("小","六");//@Param传递参数
		
//		User user = new User();//分页pojo传参
//		RowBounds row = new RowBounds(1,2);
//		user.setName("小");
//		user.setNote("六");
//		List<User> user2 = mapper.getUser(user,row);
		
		User user = new User();
		user.setName("小六");
		user.setNote("六");
		mapper.insert(user);
		System.out.println(user);
		List<User> user2 = mapper.getUser(user);
		System.out.println(user2);
	}
}
