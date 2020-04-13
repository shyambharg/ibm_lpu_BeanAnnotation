package com.example.demo;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Image;
import com.example.service.ImageService;
import com.example.service.ImageServiceImplement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	ImageService imgInterface = ctx.getBean("imageServiceImplement",ImageServiceImplement.class);
    	Image img = ctx.getBean("image",Image.class);
    	img.setImageId(UUID.randomUUID().toString());
    	img.setImageUrl("instagram");
    	System.out.println(imgInterface.createImageService(img));
    	
    	imgInterface.updateImageService("instagram", "instagram.com");
    	imgInterface.delete("facebook");
    }
}
