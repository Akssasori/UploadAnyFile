package com.example.multiPartFile.demo.service.inter;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadService {

    void uploadFileToDb(MultipartFile file) throws IOException;
}
