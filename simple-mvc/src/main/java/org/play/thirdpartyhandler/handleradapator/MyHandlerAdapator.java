package org.play.thirdpartyhandler.handleradapator;

import org.play.thirdpartyhandler.annotation.MyHandler;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * 注解扫描判断 Handler 的支持类型
 */
public class MyHandlerAdapator implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return Objects.nonNull(handler.getClass().getAnnotation(MyHandler.class));
    }

    @Override
    public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return ((org.play.thirdpartyhandler.MyHandler)handler).handleRequest();
    }

    @Override
    public long getLastModified(HttpServletRequest request, Object handler) {
        return 0;
    }
}
