package com.fym.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fym.dao.UserDao;
import com.fym.entity.User;

@Repository
public class UserDaoImp implements UserDao{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return jdbc.query("select * from users",new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user=new User();
				user.setuId(rs.getInt("uId"));
				user.setuName(rs.getString("uName"));
				user.setuPsw(rs.getString("uPsw"));
				return user;
			}
			
		} );
	}
	
}
