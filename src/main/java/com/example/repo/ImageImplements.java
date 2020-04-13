package com.example.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bean.Image;

@Repository
public class ImageImplements implements ImageInterface {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static Logger logger=Logger.getLogger("ImageImplements");

	
	public Image createImage(Image img) {
//		try {
//			logger.log(Level.INFO, "connecting to database");
//			connection=dataSource.getConnection();
//			logger.log(Level.INFO, "connected");
//			PreparedStatement pStatement=connection.prepareStatement("insert into image value(?,?)");
//			pStatement.setString(1, img.getImageId());
//			pStatement.setString(2, img.getImageUrl());
//			pStatement.executeUpdate();
//			logger.log(Level.INFO, "todo creation completed");
//		} catch (Exception e) {
//			logger.log(Level.SEVERE, "unable to connect db");
//			e.printStackTrace();
//			
//		}
//			return img;
//		}
		
		String sql = "insert into image (imageId,imageUrl) values(?,?)";
		
		jdbcTemplate.update(sql,img.getImageId(),img.getImageUrl());
		return img;
	}
}


