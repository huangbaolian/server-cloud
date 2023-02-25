package com.server.demo.seater.storage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.demo.seater.storage.dao.StorageMapper;
import com.server.demo.seater.storage.entity.Storage;
import com.server.demo.seater.storage.service.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@Service
@RequiredArgsConstructor
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {
    @Override
    public void decrease(Long productId, Integer count) {
        Storage storage = lambdaQuery().eq(Storage::getProductId, productId).one();

        lambdaUpdate().set(Storage::getUsed, storage.getUsed() + count)
                .set(Storage::getResidue, storage.getResidue() - count)
                .eq(Storage::getProductId, productId)
                .update();
    }
}
