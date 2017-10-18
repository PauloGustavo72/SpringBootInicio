package br.com.alura.listavip;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class Interceptor extends WebMvcConfigurerAdapter{
		
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new TesteInterceptor());
	}

}
