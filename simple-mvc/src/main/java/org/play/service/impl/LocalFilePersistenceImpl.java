package org.play.service.impl;

import org.play.service.FilePersistence;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;

// 本地存储持久化文件方式
public class LocalFilePersistenceImpl implements FilePersistence {

    private final String path;

    public LocalFilePersistenceImpl(String path){
        this.path = path;
    }

    @Override
    public void persistMultipartFile(MultipartFile file) {
        try {
            FileOutputStream outputStream = new FileOutputStream(this.path);
            outputStream.write(file.getBytes());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
