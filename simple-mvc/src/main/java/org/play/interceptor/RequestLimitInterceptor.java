package org.play.interceptor;

import org.play.bean.RequestCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestLimitInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private RequestCounter requestCounter;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return this.requestCounter.isReachable();
    }

    public RequestLimitInterceptor(){;}

    public RequestLimitInterceptor(RequestCounter counter) {
        this.requestCounter = counter;
    }
}
