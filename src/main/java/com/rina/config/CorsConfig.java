package com.rina.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
<<<<<<< HEAD
 * 跨域配置
 *
 * @author arvin
 * @date 2022/02/15
=======
 * 跨域相关的配置类
 *
 * @author arvin
 * @date 2022/02/16
>>>>>>> c27aa4f (feat(config): 添加了配置类)
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		WebMvcConfigurer.super.addCorsMappings(registry);
		registry.addMapping("/**")
				.allowedHeaders("*")
				.allowedMethods("POST", "GET")
				.allowedOrigins("*");
	}
}
