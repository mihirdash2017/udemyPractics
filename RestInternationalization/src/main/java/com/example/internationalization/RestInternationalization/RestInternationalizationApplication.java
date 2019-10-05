package com.example.internationalization.RestInternationalization;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.LocaleResolver;



@SpringBootApplication
public class RestInternationalizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestInternationalizationApplication.class, args);
	}
	
	@Bean
	public LocaleResolver doResolveLocale(){
		SessionLocaleResolver localeResolver=new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
		
	}
	
	@Bean(name="messageSource")
	ResourceBundleMessageSource bundleMessageSource(){
		ResourceBundleMessageSource messagesource=new ResourceBundleMessageSource();
		messagesource.setBasename("message");
		return messagesource;
	}

}
