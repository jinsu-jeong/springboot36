package ksmart36.mybatis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import ksmart36.mybatis.interceptor.CommonInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	@Autowired
	private CommonInterceptor commonInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// addInterceptors : 인터셉터라는 것을 알려주기 위함.
		// InterceptorRegistry 인터셉터를 저장하는 보관소 같은 느낌.
		registry.addInterceptor(commonInterceptor)
				.addPathPatterns("/**")  //모든 주소 요청 /**
				.excludePathPatterns("/css/**"); //static 하위 css 하위의 모든 파일들은 포함하지 않겠다.
		
	}
}
