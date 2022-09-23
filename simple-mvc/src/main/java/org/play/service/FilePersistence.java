package org.play.service;

import org.springframework.web.multipart.MultipartFile;

public interface FilePersistence {
    void persistMultipartFile(MultipartFile file);
}
