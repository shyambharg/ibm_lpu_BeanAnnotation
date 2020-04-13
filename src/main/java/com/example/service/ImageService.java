package com.example.service;

import java.util.List;

import com.example.bean.Image;

public interface ImageService {
	
	public Image createImageService(Image img);
	
	public void updateImageService(String imageUrl,String imageNewUrl);
	
	public void delete(String imageUrl);
	
	public List<Image> displayImageService();
	
	public Image displayByUrlService(String imageUrl);

}
