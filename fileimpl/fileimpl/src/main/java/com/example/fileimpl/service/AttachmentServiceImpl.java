package com.example.fileimpl.service;

import com.example.fileimpl.entity.Attachment;
import com.example.fileimpl.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AttachmentServiceImpl implements AttachmentService{

    @Autowired
    private AttachmentRepository attachmentRepository;

    public AttachmentServiceImpl(AttachmentRepository attachmentRepository) {
        this.attachmentRepository = attachmentRepository;
    }

    @Override
    public Attachment saveUplaod(MultipartFile file) {
        String fileName= StringUtils.cleanPath(file.getOriginalFilename());
        try{

        if (fileName.contains("..")) {
            throw new Exception("invalid fileName sequence:"+fileName);
        }
        Attachment attachment=new Attachment(fileName, file.getContentType(), file.getBytes());
        return attachmentRepository.save(attachment);

        } catch (Exception e) {
            throw new RuntimeException("cannot upload file:"+fileName);
        }
    }

    @Override
    public Attachment getAttachment(String fileId) throws Exception {
        return attachmentRepository
                .findById(fileId)
                .orElseThrow(
                        () -> new Exception("File not found with Id: " + fileId));
    }

}
