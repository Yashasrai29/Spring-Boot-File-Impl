package com.example.fileimpl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseData {
    private String fileName;
    private String downloadURL;
    private String fileType;
    private long fileSize;

}
