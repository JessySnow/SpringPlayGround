package org.play.thirdpartyhandler.impl;

import org.play.thirdpartyhandler.MyHandler;
import org.springframework.web.servlet.ModelAndView;

@org.play.thirdpartyhandler.annotation.MyHandler
public class MyHandlerBaseImpl implements MyHandler{
    @Override
    public ModelAndView handleRequest() {
        return new ModelAndView("index");
    }
}

