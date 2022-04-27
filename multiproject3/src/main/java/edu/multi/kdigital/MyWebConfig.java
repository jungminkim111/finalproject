package edu.multi.kdigital;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//현재파일 웹설정 포할파일
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/upload/**")//url 사용시 /upload 로호출
		.addResourceLocations("file:///c:/upload/");//실제경로
		//static 폴더이외에 사용할파일을 설정
	}

}
