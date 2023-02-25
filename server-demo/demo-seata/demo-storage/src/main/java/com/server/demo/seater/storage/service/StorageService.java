package com.server.demo.seater.storage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.server.demo.seater.storage.entity.Storage;
import org.springframework.stereotype.Service;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@Service
public interface StorageService extends IService<Storage> {

    void decrease(Long productId, Integer count);
}