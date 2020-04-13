package com.example.service;

import com.example.bean.Image;

public interface ImageService {
	
	public Image createImageService(Image img);
	
	public void updateImageService(String imageUrl,String imageNewUrl);
	
	public void delete(String imageUrl);

}
