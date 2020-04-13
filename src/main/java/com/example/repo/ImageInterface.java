package com.example.repo;

import java.util.List;

import com.example.bean.Image;

public interface ImageInterface {
	
	public Image createImage(Image img);
	

	public void updateImage(String url,String newUrl);
	
	public void deleteImage(String imageUrl);
	
	public List<Image> displayAll();
	
	public Image displayByUrl(String imageUrl);
}
