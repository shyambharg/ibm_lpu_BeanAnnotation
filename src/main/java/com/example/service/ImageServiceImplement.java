package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Image;
import com.example.repo.ImageInterface;

@Service
public class ImageServiceImplement implements ImageService{

	@Autowired
	private ImageInterface imageInterface;
	
	public Image createImageService(Image img) {
		return imageInterface.createImage(img);
	}

	public void updateImageService(String imageUrl, String imageNewUrl) {
		imageInterface.updateImage(imageUrl, imageNewUrl);
	}

	public void delete(String imageUrl) {
		imageInterface.deleteImage(imageUrl);
	}

}
