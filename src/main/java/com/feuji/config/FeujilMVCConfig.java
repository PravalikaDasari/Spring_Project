package com.feuji.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.feuji" })
public class FeujilMVCConfig implements WebMvcConfigurer {

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");

		return resolver;
	}

//	@Override
//	public void configureHandlerExceptionResolvers(
//			List<HandlerExceptionResolver> resolvers) {
//		SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
//		exceptionResolver.setDefaultErrorView("error");// Global
//
//		Properties properties = new Properties();
//		properties.put("java.lang.Exception", "errorBook"); // Specific
//		// properties.put("com.book.app.config.exception.BookException", "errorBook");
//		exceptionResolver.setExceptionMappings(properties);
//
//		resolvers.add(exceptionResolver);
//		WebMvcConfigurer.super.configureHandlerExceptionResolvers(resolvers);
//	}

//	@Bean
//	public CommonsMultipartResolver multipartResolver() {
//		return new CommonsMultipartResolver();
//	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

}
