package com.jkslw.dao;

import com.jkslw.model.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsDao {

    public List<Map> getGoods();

    List<Map<String,Object>> getGoodslIst();

    List<Map<String,Object>> getGoodsGroupList();

    List<Map<String,Object>> getGoodsAdlIst();

}
