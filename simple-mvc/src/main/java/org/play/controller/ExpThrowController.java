package org.play.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 固定抛出异常的 Controller
 * 测试 DispatcherServlet 的全局异常捕捉
 */
public class ExpThrowController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        throw new Exception("Throw Controller");
    }
}
