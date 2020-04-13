package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.example.bean.Image;

public class ImageMapper implements RowMapper<Image>{

	public Image mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Image img = (Image) ctx.getBean("myImage");
		img.setImageId(rs.getString("imageId"));
		img.setImageUrl(rs.getString("imageUrl"));
		return img;
	}
	

}
