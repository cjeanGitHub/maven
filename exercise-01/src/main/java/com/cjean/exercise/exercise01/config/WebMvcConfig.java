package com.cjean.exercise.exercise01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


/**
 * 配置类，启动的时候加上静态文件
 * @ClassName:   WebMvcConfig  
 * @Description: TODO
 * @author       BurgessLee
 * @date         2019年6月28日  
 *
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

	//这里配置静态资源文件的路径导包都是默认的直接导入就可以
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**")
				.addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
		super.addResourceHandlers(registry);
	}
}

	
