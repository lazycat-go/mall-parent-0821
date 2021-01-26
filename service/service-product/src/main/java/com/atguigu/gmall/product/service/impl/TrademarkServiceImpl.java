package com.atguigu.gmall.product.service.impl;

import com.atguigu.gmall.model.product.BaseTrademark;
import com.atguigu.gmall.product.mapper.BaseTrademarkMapper;
import com.atguigu.gmall.product.service.TrademarkService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrademarkServiceImpl implements TrademarkService {
    @Autowired
    BaseTrademarkMapper baseTrademarkMapper;
    @Override
    public List<BaseTrademark> getTrademarkList() {
        List<BaseTrademark> baseTrademarks = baseTrademarkMapper.selectList(null);
        return baseTrademarks;
    }

    @Override
    public IPage<BaseTrademark> baseTrademark(Long page, Long limit) {
        Page<BaseTrademark> pageParam = new Page<>();

        pageParam.setSize(limit);
        pageParam.setCurrent(page);

        IPage<BaseTrademark> iPage = baseTrademarkMapper.selectPage(pageParam, null);

        return iPage;
    }
}
