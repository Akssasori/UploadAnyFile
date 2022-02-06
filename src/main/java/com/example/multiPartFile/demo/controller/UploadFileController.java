package com.example.multiPartFile.demo.controller;

import com.example.multiPartFile.demo.service.inter.UploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("upload")
@RequiredArgsConstructor
public class UploadFileController {

    private final UploadService uploadService;

    @PostMapping
    public void upload(@RequestPart("file")MultipartFile file) throws IOException {
        uploadService.uploadFileToDb(file);
    }
}
