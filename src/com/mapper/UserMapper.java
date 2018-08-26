package com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.domain.User;

public interface UserMapper {
//	public List<User> getUser(Map<String,Object> map);
//	public List<User> getUser(@Param("name") String name,@Param("note") String note);
//	public List<User> getUser(User user,RowBounds rowBounds);
	public List<User> getUser(User user);
	public void insert(User user);
}
