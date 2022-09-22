package org.play.controller;

import org.play.bean.Entity;
import org.play.service.EntityService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EntityController extends AbstractController {

    private EntityService entityService;
    private String viewName;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView(this.getViewName());
        mv.addObject("entity", this.entityService.getEntity());
        return mv;
    }

    public EntityService getEntityService() {
        return entityService;
    }

    public String getViewName() {
        return viewName;
    }

    public void setEntityService(EntityService entityService) {
        this.entityService = entityService;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
}
