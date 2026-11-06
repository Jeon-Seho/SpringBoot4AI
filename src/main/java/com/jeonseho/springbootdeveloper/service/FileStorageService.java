package com.jeonseho.springbootdeveloper.service;

import com.jeonseho.springbootdeveloper.dto.UploadResponse;

public interface FileStorageService {
    UploadResponse store(byte[] bytes, String filename);
}
