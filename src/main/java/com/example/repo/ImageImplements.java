package com.example.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bean.Image;
import com.example.mapper.ImageMapper;

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
	public void updateImage(String imageUrl,String imageNewUrl)
	{
		String sql = "update image set imageUrl = ? where imageUrl = ?";
		jdbcTemplate.update(sql,imageNewUrl,imageUrl);
		System.out.println("updated");
		
	}
	public void deleteImage(String imageUrl)
	{
		String sql = "delete from image where imageUrl = ?";
		jdbcTemplate.update(sql,imageUrl);
		System.out.println("deleted");
	}
	public List<Image> displayAll() {
		
		String sql = "select * from image";
		List<Image> imgs= jdbcTemplate.query(sql, new ImageMapper());
		return imgs;
	}
	public Image displayByUrl(String imageUrl) {
		String sql = "select * from image where imageUrl=?";
		return jdbcTemplate.queryForObject(sql, new Object [] {imageUrl},new ImageMapper());
	}
	
	
}


