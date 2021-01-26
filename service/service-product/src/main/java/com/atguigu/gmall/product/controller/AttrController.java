package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.model.product.BaseAttrInfo;
import com.atguigu.gmall.model.product.BaseAttrValue;
import com.atguigu.gmall.product.service.AttrService;
import com.atguigu.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("admin/product/")
@CrossOrigin
public class AttrController {

    @Autowired
    AttrService attrService;

    @RequestMapping("attrInfoList/{category1Id}/{category2Id}/{category3Id}")
    public Result attrInfoList(@PathVariable("category1Id")long categoryId
                                ,@PathVariable("category2Id")long category2Id
                                ,@PathVariable("category3Id")long category3Id){

        List<BaseAttrInfo> attrInfos=attrService.attrInfoList(category3Id);
        return Result.ok(attrInfos);
    }

    @RequestMapping("saveAttrInfo")
    public Result saveAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo){

        attrService.saveAttrInfo(baseAttrInfo);

        return Result.ok();
    }
    @RequestMapping("getAttrValueList/{attr_id}")
    public Result getAttrValueList(@PathVariable("attr_id") Long attr_id){

        List<BaseAttrValue> baseAttrValues = attrService.getAttrValueList(attr_id);

        return Result.ok(baseAttrValues);
    }
}
