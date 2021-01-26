package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.BaseSaleAttr;
import com.atguigu.gmall.model.product.SpuImage;
import com.atguigu.gmall.model.product.SpuInfo;
import com.atguigu.gmall.model.product.SpuSaleAttr;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

public interface SpuService {
    void saveSpuInfo(SpuInfo spuInfo);

    List<BaseSaleAttr> baseSaleAttrList();

    IPage<SpuInfo> spuList(Long page, Long limit, Long category3Id);

    List<SpuSaleAttr> spuSaleAttrList(Long spuId);

    List<SpuImage> spuImageList(Long spuId);
}
