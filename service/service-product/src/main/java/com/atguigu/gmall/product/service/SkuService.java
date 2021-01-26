package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.SkuInfo;
import com.atguigu.gmall.model.product.SpuImage;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SkuService {


    void onSale(Long skuId);

    void cancelSale(Long skuId);

    IPage<SkuInfo> skuList(Long page, Long limit);

    void saveSkuInfo(SkuInfo skuInfo);
}
