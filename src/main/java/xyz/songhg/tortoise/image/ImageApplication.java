package xyz.songhg.tortoise.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.songhg.tortoise.image.listener.PropertiesListener;

@SpringBootApplication
public class ImageApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ImageApplication.class);

		// 注册properties 文件监听器, 解析文件
		application.addListeners(new PropertiesListener("image-header.properties"));
		application.run(args);
	}

}
