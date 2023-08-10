package kr.co.dreamlabs.gdthink.gdthink;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginCheckInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		final Logger logger = LoggerFactory.getLogger(this.getClass());
		String requestURI = request.getRequestURI();
		HttpSession session = request.getSession(false);
		
		logger.info("[interceptor] : " + requestURI);
		logger.info("[session] : " + session);
		
		if(session == null || session.getAttribute("id") == null) {
       		// 로그인 되지 않음
			logger.info("[미인증 사용자 요청]");
			
			//로그인으로 redirect
			response.sendRedirect("/login");
			return false;
		}
        // 로그인 되어있을 떄
		return true;
	}
}
