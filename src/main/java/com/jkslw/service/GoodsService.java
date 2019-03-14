package com.jkslw.service;

import com.jkslw.model.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {

    public List<Map> getGoods();
//    public List<Map> updateGoods();

    List<Map<String,Object>> getGoodslIst();

    List<Map<String,Object>> getGoodsGroupList();

    List<Map<String,Object>> getGoodsAdlIst();

}

