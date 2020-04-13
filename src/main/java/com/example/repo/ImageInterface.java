package com.example.repo;

import com.example.bean.Image;

public interface ImageInterface {
	
	public Image createImage(Image img);
	

	public void updateImage(String url,String newUrl);
	
	public void deleteImage(String imageUrl);
}
