package com.example.multiPartFile.demo.service.impl;

import com.example.multiPartFile.demo.model.UploadFile;
import com.example.multiPartFile.demo.repository.UploadFileRepository;
import com.example.multiPartFile.demo.service.inter.UploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class UploadServiceImpl implements UploadService {

    private final UploadFileRepository uploadFileRepository;

    @Override
    public void uploadFileToDb(MultipartFile file) throws IOException {

        UploadFile uploadFile = new UploadFile();

        uploadFile.setFileName(file.getName());
        uploadFile.setFileExtension(file.getContentType());
        uploadFile.setFileContent(file.getBytes());
        uploadFileRepository.save(uploadFile);

    }
}
