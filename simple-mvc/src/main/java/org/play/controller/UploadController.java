package org.play.controller;

import org.play.service.FilePersistence;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UploadController extends AbstractController {

    private final FilePersistence filePersistence;

    public UploadController(FilePersistence filePersistence){
        this.filePersistence = filePersistence;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        MultipartFile multipartFile = multipartHttpServletRequest.getFile("fileUpLoaded");
        String comment = multipartHttpServletRequest.getParameter("comment");

        System.out.println(comment);
        System.out.println(multipartFile == null ? "NPE" : multipartFile.getOriginalFilename());

        // 文件存储
        filePersistence.persistMultipartFile(multipartFile);

        return new ModelAndView("index").addObject("comment",comment);
    }
}
