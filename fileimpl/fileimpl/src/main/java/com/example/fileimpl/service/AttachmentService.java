package com.example.fileimpl.service;

import com.example.fileimpl.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveUplaod(MultipartFile file);

    Attachment getAttachment(String fileId) throws Exception;
}
