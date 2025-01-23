package com.example.fileimpl.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="attach")
public class Attachment {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid2")
    private String id;

    private String fileName;
    private String fileType;
    @Lob
    private byte[] data;

    public Attachment(String fileName, String contentType, byte[] bytes) {
    }
}
