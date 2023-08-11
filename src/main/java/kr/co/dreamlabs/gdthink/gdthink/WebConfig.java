package kr.co.dreamlabs.gdthink.gdthink;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Component
public class WebConfig implements WebMvcConfigurer{
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LogInterceptor()) // LogInterceptor 등록
				.order(1)	// 적용할 필터 순서 설정
				.addPathPatterns("/**")
				.excludePathPatterns("/error"); // 인터셉터에서 제외할 패턴
		
		registry.addInterceptor(new LoginCheckInterceptor()) //LoginCheckInterceptor 등록
				.order(2)
				.addPathPatterns("/**/regNotice", "/**/upForm", "/**/deleteNotice", "/**/updateNotice", "/**/inputNotice")
				.excludePathPatterns("/css/**", "/login", "/js/**", "/img/**", "/lib/**");
	}
}
